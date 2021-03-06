package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Cliente;
import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class FacturaController {

    @Autowired
    FacturaService service;

    @PostMapping("/factura")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura) {
        return this.service.save(factura);
    }

    @GetMapping(value = "/factura")
    private Flux<Factura> findAll() {
        return this.service.findAll();
    }

    @PutMapping("/factura/{id}")
    private Mono<ResponseEntity<Factura>> update(@PathVariable("id") String id, @RequestBody Factura factura) {
        return this.service.update(id, factura)
                .flatMap(factura1 -> Mono.just(ResponseEntity.ok(factura1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/factura/{id}")
    private Mono<ResponseEntity<Factura>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(factura1 -> Mono.just(ResponseEntity.ok(factura1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

}
