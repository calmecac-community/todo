package mx.calmecac.todo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.calmecac.todo.controllers.filtros.TareaFiltro;
import mx.calmecac.todo.model.Tarea;
import mx.calmecac.todo.service.TareaDummyService;
import mx.calmecac.todo.service.TareaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class TareaRestController {

    @Autowired
    private TareaService service;

    // -> /api/tareas?nombre=oxis&descripcion=ldlf
    @RequestMapping("/tareas")
    public List<Tarea> getTareas(TareaFiltro filtro) {
        return service.consultaTareas(filtro);
    }

    @RequestMapping("/tareas/filtro")
    public TareaFiltro getTareasFiltro(TareaFiltro filtro) {
        return filtro;
    }

    @PostMapping("/tareas")
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return service.guardarTarea(tarea);
    }
    
    
}
