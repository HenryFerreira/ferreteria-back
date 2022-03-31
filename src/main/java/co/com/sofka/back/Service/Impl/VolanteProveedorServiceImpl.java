package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.VolanteProveedor;
import co.com.sofka.back.Repository.VolanteProveedorRepository;
import co.com.sofka.back.Service.VolanteProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VolanteProveedorServiceImpl implements VolanteProveedorService {

    @Autowired
    VolanteProveedorRepository repository;

    @Override
    public Mono<VolanteProveedor> save(VolanteProveedor volanteProveedor) {
        return repository.save(volanteProveedor);
    }

    @Override
    public Flux<VolanteProveedor> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<VolanteProveedor> update(String id, VolanteProveedor volanteProveedor) {
        return this.repository.findById(id)
                .flatMap(volanteProveedorUpdate -> {
                    volanteProveedor.setId(id);
                    return save(volanteProveedor);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<VolanteProveedor> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(volanteProveedorDelete -> this.repository
                        .deleteById(volanteProveedorDelete.getId())
                        .thenReturn(volanteProveedorDelete));
    }

}
