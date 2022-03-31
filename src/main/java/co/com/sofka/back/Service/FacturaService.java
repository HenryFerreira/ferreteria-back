package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FacturaService {
    Mono<Factura> save(Factura factura);

    Flux<Factura> findAll();

    Mono<Factura> update(String id, Factura factura);

    Mono<Factura> delete(String id);
}
