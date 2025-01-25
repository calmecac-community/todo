package mx.calmecac.todo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.calmecac.todo.model.Tarea;
import static mx.calmecac.todo.util.DataFactory.getRandomTarea;

@RestController
@RequestMapping("/api")
public class TareaRestController {

    @RequestMapping("/tareas")
    public List<Tarea> getTareas() {
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(getRandomTarea());
        tareas.add(getRandomTarea());
        return tareas;
    }
}
