package mx.calmecac.todo.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import mx.calmecac.todo.model.Usuario;

public class BaseController {

    @ModelAttribute("usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setUsername("lacandon");
        usuario.setPrimerApellido("Lacandon Primer apellido");
        usuario.setSegundoApellido("Lacandon segundo apellido");
        return usuario;
    }
}
