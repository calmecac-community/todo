package mx.calmecac.todo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.calmecac.todo.model.Tarea;

@RestController
@RequestMapping("/api")
public class TareaRestController {

    @RequestMapping("/tareas")
    public List<Tarea> getTareas(){
        List<Tarea> tareas = new ArrayList<>();
        Tarea ejercioDeProgramacion = Tarea.builder().id("1").nombre("Ejercicio de programacion").descripcion("Ejercicio de java").build();
        Tarea barrearLaCasa = Tarea.builder().id("2").nombre("Barrer la casa").descripcion("Barrer de manera completa la casa").build();
        tareas.add(ejercioDeProgramacion);
        tareas.add(barrearLaCasa);
        return tareas;
    }
}
