package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Service.Impl.ProveedorServiceImpl;
import co.com.sofka.back.Service.ProductoService;
import co.com.sofka.back.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ProveedorController {

    @Autowired
    ProveedorService service;

    @PostMapping("/proveedor")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Proveedor> save(@RequestBody Proveedor proveedor) {
        return this.service.save(proveedor);
    }

    @GetMapping(value = "/proveedor")
    private Flux<Proveedor> findAll() {
        return this.service.findAll();
    }

    @PutMapping("/proveedor/{id}")
    private Mono<ResponseEntity<Proveedor>> update(@PathVariable("id") String id, @RequestBody Proveedor proveedor) {
        return this.service.update(id, proveedor)
                .flatMap(proveedor1 -> Mono.just(ResponseEntity.ok(proveedor1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/proveedor/{id}")
    private Mono<ResponseEntity<Proveedor>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(proveedor1 -> Mono.just(ResponseEntity.ok(proveedor1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

}
