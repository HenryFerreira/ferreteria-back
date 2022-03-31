package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.VolanteProveedor;
import co.com.sofka.back.Service.Impl.VolanteProveedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class VolanteProveedorController {
    @Autowired
    VolanteProveedorServiceImpl service;

    @PostMapping("/volanteProveedor")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<VolanteProveedor> save(@RequestBody VolanteProveedor volanteProveedor) {
        return this.service.save(volanteProveedor);
    }

    @GetMapping(value = "/volanteProveedor")
    private Flux<VolanteProveedor> findAll() {
        return this.service.findAll();
    }

    @PutMapping("/volanteProveedor/{id}")
    private Mono<ResponseEntity<VolanteProveedor>> update
            (@PathVariable("id") String id, @RequestBody VolanteProveedor volanteProveedor) {
        return this.service.update(id, volanteProveedor)
                .flatMap(volanteProveedor1 -> Mono.just(ResponseEntity.ok(volanteProveedor1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/volanteProveedor/{id}")
    private Mono<ResponseEntity<VolanteProveedor>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(volanteProveedor1 -> Mono.just(ResponseEntity.ok(volanteProveedor1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }
}
