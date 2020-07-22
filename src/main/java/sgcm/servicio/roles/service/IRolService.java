package sgcm.servicio.roles.service;

import java.util.List;

import sgcm.servicio.roles.model.entity.Rol;

public interface IRolService {
    public List<Rol> getRoles();
    public Rol addRol(Rol rol);
    public Rol findById(int id);
    public void delete (int id);
}