package mx.calmecac.todo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tarea {
    private String id;
    private String nombre;
    private String descripcion;
}
