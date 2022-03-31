package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Repository.ProveedorRepository;
import co.com.sofka.back.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    ProveedorRepository repository;

    @Override
    public Mono<Proveedor> save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public Flux<Proveedor> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Proveedor> update(String id, Proveedor proveedor) {
        return this.repository.findById(id)
                .flatMap(proveedorUpdate -> {
                    proveedor.setId(id);
                    return save(proveedor);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<Proveedor> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(proveedorDelete -> this.repository.deleteById(proveedorDelete.getId()).thenReturn(proveedorDelete));
    }

}
