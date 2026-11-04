package mx.edu.utez.MT09_Luis_Avila_CA2.repository;

import java.util.List;
import mx.edu.utez.MT09_Luis_Avila_CA2.repository.cursoRepository;
import org.springframework.data.jpa.repository.JpaRepository;






    public interface cursoRepository extends JpaRepository<mx.edu.utez.MT09_Luis_Avila_CA2.repository.cursoRepository, Long> {

        List<mx.edu.utez.MT09_Luis_Avila_CA2.repository.cursoRepository> findByDisponibleTrue();
    }


