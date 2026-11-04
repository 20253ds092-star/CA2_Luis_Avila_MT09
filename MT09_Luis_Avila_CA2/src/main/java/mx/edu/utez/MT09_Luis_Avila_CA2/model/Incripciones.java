package mx.edu.utez.MT09_Luis_Avila_CA2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Incripciones {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


        private String nombreParticipante;
        private int edadParticipante;
        private String correo;
        private LocalDate fechaInscripcion;
        private  boolean estado;
        private  double calificacion;


        public Incripciones() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombreParticipante() {
            return nombreParticipante;
        }

        public void setNombreParticipante(String nombreParticipante) {
            this.nombreParticipante = nombreParticipante;
        }

        public int getEdadParticipante(){
            return  edadParticipante;
        }
        public  void  setEdadParticipante(int edadParticipante){this.edadParticipante= edadParticipante;}

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

        public boolean getEstado() {
            return estado;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }


    public double getCalificacion() {
        return calificacion;
    }

    public  void  setCalificacion(double calificacion){this.calificacion = calificacion;}



}
