package start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import start.Model.PrevidenciaModel;

@Repository
public interface PrevidenciaRepository extends JpaRepository<PrevidenciaModel, Long> {

}
