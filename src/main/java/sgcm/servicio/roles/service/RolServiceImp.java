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
    public List<Rol> getRoles() {
        return (List<Rol>)irol.findAll();
    }

    @Override
    public Rol addRol(Rol rol) {
        return irol.save(rol);
    }

    @Override
	public Rol findById(int id) {
		return irol.findById(id).orElse(null);
    }
    
    @Override
    public void delete(int id) {
        irol.deleteById(id);
    }
}