package mx.calmecac.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import mx.calmecac.todo.controllers.filtros.TareaFiltro;
import mx.calmecac.todo.model.Tarea;
import mx.calmecac.todo.repository.TareaRepository;

@Service
@Primary
public class TareaDbService implements TareaService {

    @Autowired
    private TareaRepository repository;

    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return repository.save(tarea);
    }

    @Override
    public List<Tarea> consultaTareas(TareaFiltro filtro) {
        return repository.findAll();
    }

    @Override
    public Tarea consultaTarea(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultaTarea'");
    }

    @Override
    public int eliminaTarea(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminaTarea'");
    }

}
