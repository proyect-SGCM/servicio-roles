package sgcm.servicio.roles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sgcm.servicio.roles.model.entity.Rol;
import sgcm.servicio.roles.service.IRolService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IRolService rolservice;

    @GetMapping("/get_roles")
    public List<Rol> listarRoles(){
        return rolservice.listar();
    }
}