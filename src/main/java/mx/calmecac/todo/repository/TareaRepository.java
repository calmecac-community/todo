package mx.calmecac.todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.calmecac.todo.model.Tarea;

@Repository
public interface TareaRepository extends MongoRepository<Tarea, String>{

}
