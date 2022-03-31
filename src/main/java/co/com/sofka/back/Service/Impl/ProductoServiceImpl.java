package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Repository.ProductoRepository;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository repository;

    @Override
    public Mono<Producto> save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Flux<Producto> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Producto> update(String id, Producto producto) {
        return this.repository.findById(id)
                .flatMap(productoUpdate -> {
                    producto.setId(id);
                    return save(producto);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<Producto> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(productoDelete -> this.repository.deleteById(productoDelete.getId()).thenReturn(productoDelete));
    }

}
