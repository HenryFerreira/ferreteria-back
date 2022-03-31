package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Repository.FacturaRepository;
import co.com.sofka.back.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository repository;

    @Override
    public Mono<Factura> save(Factura factura) {
        return repository.save(factura);
    }

    @Override
    public Flux<Factura> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Factura> update(String id, Factura factura) {
        return this.repository.findById(id)
                .flatMap(facturaUpdate -> {
                    factura.setId(id);
                    return save(factura);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<Factura> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(facturaDelete -> this.repository.deleteById(facturaDelete.getId()).thenReturn(facturaDelete));
    }

}
