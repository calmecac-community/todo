package mx.calmecac.todo.service;

import static mx.calmecac.todo.util.DataFactory.getRandomTarea;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import mx.calmecac.todo.controllers.filtros.TareaFiltro;
import mx.calmecac.todo.model.Tarea;

@Service
public class TareaDummyService implements TareaService{

    // tareaDummyService
    public Tarea guardarTarea(Tarea tarea) {
        return tarea;
    }

    public List<Tarea> consultaTareas(TareaFiltro filtro) {
        List<Tarea> tareas = new ArrayList<>();
        Tarea tarea1 = getRandomTarea();
        Tarea tarea2 = getRandomTarea();
        tarea1.setNombre(filtro.getNombre());
        tarea1.setDescripcion(filtro.getDescripcion());
        tarea2.setNombre(filtro.getNombre());
        tarea2.setDescripcion(filtro.getDescripcion());
        tareas.add(tarea1);
        tareas.add(tarea2);
        return tareas;
    }

    public Tarea consultaTarea(String id) {
        return null;
    }

    public int eliminaTarea(String id) {
        return 0;
    }
}
