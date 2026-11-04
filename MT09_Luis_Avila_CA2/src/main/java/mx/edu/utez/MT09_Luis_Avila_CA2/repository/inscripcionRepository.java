package mx.edu.utez.MT09_Luis_Avila_CA2.repository;

import java.util.List;
import java.util.Optional;
import mx.edu.utez.MT09_Luis_Avila_CA2.model.curso;
import org.springframework.data.jpa.repository.JpaRepository;


public interface inscripcionRepository  extends  JpaRepository <curso,Long> {




        List<inscripcionRepository> findByestadoParticipante(estadoInscripcion estado);

        Optional<inscripcionRepository> findByInscripcionIdAndEstado(Long InscripciopId, estadoInscripcion estado);

        List<inscripcionRepository> findByInscripcionIdAndEstado(Long InscripcionId, estadoInscripcion estado);

        boolean existsBycursoId(Long incripcionesId);
    }

}
