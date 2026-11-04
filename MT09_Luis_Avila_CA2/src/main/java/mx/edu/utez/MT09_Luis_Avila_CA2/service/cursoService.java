package mx.edu.utez.MT09_Luis_Avila_CA2.service;
import java.util.List;
import mx.edu.utez.MT09_Luis_Avila_CA2.dto.inscripcionRequest;
import mx.edu.utez.MT09_Luis_Avila_CA2.model.curso;
import mx.edu.utez.MT09_Luis_Avila_CA2.repository.cursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
    public class cursoService {

        private final cursoRepository cursoRepo;

        public cursoService(cursoRepository cursoRepo) {
            this.cursoRepo = cursoRepo;
        }

        public curso registrar(cursoRequest req) {
            cursoRepo v = new curso();
            v.set.(req.titulo());
            v.setPlataforma(req.plataforma());
            v.setDisponible(true);
            return cursoRepo.save(v);
        }

        public List<curso> listarDisponibles() {
            return cursoRepo.findByDisponibleTrue();
        }

        public List<curso> listarTodos() {
            return cursoRepo.findAll();
        }
    }

