package mx.calmecac.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TareaController {

    // http://localhost:8080/tareas
    @RequestMapping("/mvc/tareas")
    public String showTareas(Model model) {
        model.addAttribute("titulo", "Gestor de tareas desde variable");
        model.addAttribute("subtitulo", "Lista de tareas desde variable");       
        return "tareas";
    }

}
