package co.com.sofka.back.Controller;

import co.com.sofka.back.Service.Impl.VolanteProveedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class VolanteProveedor {
    @Autowired
    VolanteProveedorServiceImpl service;
}
