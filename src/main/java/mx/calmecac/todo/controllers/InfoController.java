package mx.calmecac.todo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;
import lombok.Data;

/**
 * Clase InfoController encargada de mostrar información general sobre el
 * proyecto TO DO
 * 
 */
@RestController
@RequestMapping("/api")
public class InfoController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @Value("${app.description}")
    private String description;

    @Value("${app.version}")
    private String version;

    /**
     * Regresa un objecto Info con el nombre del proyecto, descripción, puerto en el
     * que está levantado y la versión
     * 
     * @return Info
     */
    @RequestMapping("/info")
    public Info info() {
        return Info.builder()
                .appName(appName)
                .description(description)
                .port(port)
                .version(version)
                .build();
    }

    /**
     * Clase interna que representa al objeto Info
     */
    @Data
    @Builder
    static class Info {
        private String appName;
        private String description;
        private String version;
        private String port;
    }
}
