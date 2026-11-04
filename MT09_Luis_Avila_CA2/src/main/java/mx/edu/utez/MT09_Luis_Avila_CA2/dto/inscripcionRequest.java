package mx.edu.utez.MT09_Luis_Avila_CA2.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



public  record  inscripcionRequest(
            @NotNull(message = "El id del Solicitante es obligatorio")
            Long participanteId,

            @NotBlank(message = "El nombre del solicitante es obligatorio")
            String nombreParticipante
    ) {
    }
