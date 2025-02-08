package mx.calmecac.todo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import mx.calmecac.todo.controllers.LogInterceptor;
import mx.calmecac.todo.model.Tarea;

@Configuration
public class LogConfiguration implements WebMvcConfigurer{

    @Bean
    public Tarea defaultTarea() {
        return Tarea.builder().nombre("Tarea genérica").descripcion("Descrićión de la tarea genérica").build();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor()).addPathPatterns("/api/**");
    }

}
