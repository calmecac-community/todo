package mx.calmecac.todo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.calmecac.todo.controllers.filtros.TareaFiltro;
import mx.calmecac.todo.model.Tarea;
import static mx.calmecac.todo.util.DataFactory.getRandomTarea;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class TareaRestController {

    // -> /api/tareas?nombre=oxis&descripcion=ldlf
    @RequestMapping("/tareas")
    public List<Tarea> getTareas(
            @RequestParam(required = false, defaultValue = "Pikachu") String nombre,
            @RequestParam(required = false) String descripcion) {
        List<Tarea> tareas = new ArrayList<>();
        Tarea tarea1 = getRandomTarea();
        Tarea tarea2 = getRandomTarea();
        tarea1.setNombre(nombre);
        tarea1.setDescripcion(descripcion);
        tarea2.setNombre(nombre);
        tarea2.setDescripcion(descripcion);
        tareas.add(tarea1);
        tareas.add(tarea2);
        return tareas;
    }

    @RequestMapping("/tareas/filtro")
    public TareaFiltro getTareasFiltro(TareaFiltro filtro) {
        return filtro;
    }
    
}
