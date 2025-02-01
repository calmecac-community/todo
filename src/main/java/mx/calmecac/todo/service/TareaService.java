package mx.calmecac.todo.service;

import java.util.List;

import mx.calmecac.todo.controllers.filtros.TareaFiltro;
import mx.calmecac.todo.model.Tarea;

public interface TareaService {

    public Tarea guardarTarea(Tarea tarea);

    public List<Tarea> consultaTareas(TareaFiltro filtro);

    public Tarea consultaTarea(String id);

    public int eliminaTarea(String id);
}
