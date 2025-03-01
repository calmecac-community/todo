package mx.calmecac.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.calmecac.todo.controllers.filtros.TareaFiltro;
import mx.calmecac.todo.model.Tarea;
import mx.calmecac.todo.service.TareaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class TareaRestController {

    @Autowired
    private TareaService service;

    @Autowired
    private Tarea defaultTarea;

    // -> /api/tareas?nombre=oxis&descripcion=ldlf
    @RequestMapping("/tareas")
    public List<Tarea> getTareas(TareaFiltro filtro) {
        List<Tarea> tareas = service.consultaTareas(filtro);
        tareas.add(defaultTarea);
        return tareas;
    }

    // Tarea - ejercicio
    @RequestMapping("/tareas/filtro")
    public TareaFiltro getTareasFiltro(TareaFiltro filtro) {
        return filtro;
    }

    @GetMapping("/tareas/{id}")
    public Tarea getTareaPorId(@PathVariable String id) {
        return service.consultaTarea(id);
    }
    

    @PostMapping("/tareas")
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return service.guardarTarea(tarea);
    }

    @PutMapping("/tareas/{id}")
    public Tarea actualizarTarea(@PathVariable String id, @RequestBody Tarea tarea) {
        return service.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/tareas/{id}")
    public String eliminarTarea(@PathVariable String id){
        service.eliminaTarea(id);
        return id;
    }
}
