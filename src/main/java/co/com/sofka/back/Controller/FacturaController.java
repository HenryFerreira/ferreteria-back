package co.com.sofka.back.Controller;

import co.com.sofka.back.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class FacturaController {

    @Autowired
    FacturaService service;


}
