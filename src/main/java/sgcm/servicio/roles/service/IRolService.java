package sgcm.servicio.roles.service;

import java.util.List;

import sgcm.servicio.roles.model.entity.Rol;

public interface IRolService {
    public List<Rol> listar();
    public int addRol(Rol r);
    // public Optional<Rol> listarId(int id);
    public void delete (int id);
}