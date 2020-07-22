package sgcm.servicio.roles.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sgcm.servicio.roles.model.entity.Rol;

public interface IRol extends JpaRepository<Rol, Integer> {
    
}