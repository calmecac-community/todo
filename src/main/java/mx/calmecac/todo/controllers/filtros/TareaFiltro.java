package mx.calmecac.todo.controllers.filtros;

import lombok.Data;

// ?nombre=&descripcion
@Data
public class TareaFiltro {

    private String nombre;
    private String descripcion;
    private String fechaCreacion;
}
