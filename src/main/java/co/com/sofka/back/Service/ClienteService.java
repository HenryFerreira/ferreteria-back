package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteService {

    Mono<Cliente> save(Cliente cliente);

    Flux<Cliente> findAll();

    Mono<Cliente> update(String id, Cliente cliente);

    Mono<Cliente> delete(String id);
}
