package mx.calmecac.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TareaController extends BaseController {

    // http://localhost:8080/tareas
    // Por default se esta mapeando el metodo GET
    @RequestMapping("/tareas")
    public String showTareas(Model model) {
        model.addAttribute("titulo", "Gestor de tareas desde variable");
        model.addAttribute("subtitulo", "Lista de tareas desde variable");
        return "tareas";
    }
}
