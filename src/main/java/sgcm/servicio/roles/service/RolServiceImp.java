package sgcm.servicio.roles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sgcm.servicio.roles.model.dao.IRol;
import sgcm.servicio.roles.model.entity.Rol;
@Service
public class RolServiceImp implements IRolService {
    
    @Autowired
    private IRol irol;

    @Override
    public List<Rol> listar() {
        return (List<Rol>)irol.findAll();
    }

    @Override
    public int addRol(Rol r) {
        return 0;
    }

    // @Override
    // public Optional<Rol> listarId(int id) {
    //     return null;
    // }

    @Override
    public void delete(int id) {
    }

}