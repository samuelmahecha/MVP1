package CVDS.Dina.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CVDS.Dina.proyecto.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    public List<Cliente> findByClienteid(Long id);

}
