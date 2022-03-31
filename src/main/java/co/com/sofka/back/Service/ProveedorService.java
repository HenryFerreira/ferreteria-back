package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProveedorService {
    Mono<Proveedor> save(Proveedor proveedor);

    Flux<Proveedor> findAll();

    Mono<Proveedor> update(String id, Proveedor proveedor);

    Mono<Proveedor> delete(String id);
}
