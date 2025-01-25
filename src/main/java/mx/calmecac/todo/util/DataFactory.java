package mx.calmecac.todo.util;

import com.github.javafaker.Faker;

import mx.calmecac.todo.model.Tarea;

public class DataFactory {

    private DataFactory() {

    }

    public static Tarea getRandomTarea() {
        return Tarea.builder()
                .id(Faker.instance()
                        .idNumber().valid())
                .nombre(Faker.instance().pokemon().name())
                .descripcion(Faker.instance().pokemon().name()).build();
    }
}
