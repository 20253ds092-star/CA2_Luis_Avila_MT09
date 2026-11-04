package mx.edu.utez.MT09_Luis_Avila_CA2.controller;

import java.util.List;
import mx.edu.utez.MT09_Luis_Avila_CA2.dto.CursoRequest;
import mx.edu.utez.MT09_Luis_Avila_CA2.model.curso;
import mx.edu.utez.MT09_Luis_Avila_CA2.service.cursoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class cursoController {



    @RestController
    @RequestMapping("/cursos")
    public class cursoController {

        private final cursoService service;

        public cursoController(cursoService service) {
            this.service = service;
        }

        // POST /cursos
        @PostMapping
        public ResponseEntity<curso> registrar(@Valid @RequestBody cursoRequest req) {
            return ResponseEntity.status(201).body(service.registrar(req));
        }

        // GET /cursos/disponibles
        @GetMapping("/disponibles")
        public List<mx.edu.utez.MT09_Luis_Avila_CA2.controller.cursoController> disponibles() {
            return service.listarDisponibles();
        }

        // GET /cursos
        @GetMapping
        public List<mx.edu.utez.MT09_Luis_Avila_CA2.controller.cursoController> todos() {
            return service.listarTodos();
        }
    }

}
