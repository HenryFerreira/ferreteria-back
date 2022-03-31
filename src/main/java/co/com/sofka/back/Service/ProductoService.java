package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {
    Mono<Producto> save(Producto producto);

    Flux<Producto> findAll();

    Mono<Producto> update(String id, Producto producto);

    Mono<Producto> delete(String id);
}
