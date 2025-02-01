package mx.calmecac.todo.model;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tarea {

    @Id
    private String id;
    private String nombre;
    private String descripcion;
}
