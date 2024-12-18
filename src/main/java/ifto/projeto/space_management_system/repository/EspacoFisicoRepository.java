package ifto.projeto.space_management_system.repository;

import ifto.projeto.space_management_system.model.entidades.EspacoFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacoFisicoRepository extends JpaRepository<EspacoFisico,Long> {
}
