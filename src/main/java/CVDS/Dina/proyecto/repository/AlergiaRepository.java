package CVDS.Dina.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CVDS.Dina.proyecto.model.Alergia;

@Repository
public interface AlergiaRepository extends JpaRepository<Alergia, Long> {
    public List<Alergia> findByAlergiasid(Long id);
}
