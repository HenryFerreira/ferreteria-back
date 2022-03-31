package co.com.sofka.back.Service;

import co.com.sofka.back.Model.VolanteProveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VolanteProveedorService {
    Mono<VolanteProveedor> save(VolanteProveedor volanteProveedor);

    Flux<VolanteProveedor> findAll();

    Mono<VolanteProveedor> update(String id, VolanteProveedor volanteProveedor);

    Mono<VolanteProveedor> delete(String id);
}
