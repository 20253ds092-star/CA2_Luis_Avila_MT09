package mx.edu.utez.MT09_Luis_Avila_CA2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class curso {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean estadoCurso;

    public curso() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return  descripcion;
    }
    public  void  setDescripcion(String descripcion){this.descripcion= descripcion;}

     public  LocalDate getFechaInicio(){
        return  fechaInicio;
     }
     public  void  setFechaInicio(LocalDate fechaInicio){this.fechaInicio = fechaInicio;}
    public  LocalDate getFechaFin(){
        return  fechaFin;
    }
    public  void  setFechaFin(LocalDate fechaFin){this.fechaFin = fechaFin;}



    public boolean getEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(boolean estadoCurso) {
        this.estadoCurso = estadoCurso;
    }


}
