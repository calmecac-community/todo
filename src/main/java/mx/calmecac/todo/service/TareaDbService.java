package mx.calmecac.todo.service;

import java.util.List;
import java.util.Optional;

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
    public Tarea actualizarTarea(String id, Tarea tarea) {
        tarea.setId(id);
        return repository.save(tarea);
    }

    @Override
    public Tarea consultaTarea(String id) {
        Optional<Tarea> tareaOptional = repository.findById(id);

        if(tareaOptional.isPresent()){
            return tareaOptional.get();
        }else {
            return Tarea.builder().nombre("POKEMON NO IDENTICADO").build();
        }
    }

    @Override
    public int eliminaTarea(String id) {
        repository.deleteById(id);
        return 1;
    }

}
