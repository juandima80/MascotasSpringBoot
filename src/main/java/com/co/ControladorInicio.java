package com.co;

import com.co.dao.MascotaDAO;
import com.co.dao.UsuarioDAO;
import com.co.pojo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class ControladorInicio {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private MascotaDAO mascotaDAO;

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/principal")
    public String principal() {
        return "index";
    }

    @GetMapping("/MascotasEncontradas")
    public String MascotasEncontradas(Model model) {
        var mascotas = mascotaDAO.findAll();
        model.addAttribute("mascotas", mascotas);
        return "MascotasEncontradas";
    }

    @GetMapping("/MascotasPerdidas")
    public String MascotasPerdidas() {
        return "MascotasPerdidas";
    }

    @GetMapping("/form_pet_loss")
    public String form_pet_loss() {
        return "form_pet_loss";
    }

    @GetMapping("/RegistroMascotaPerdidaEncontrada")
    public String RegistroMascotaPerdidaEncontrada() {
        return "RegistroMascotaPerdidaEncontrada";
    }

    @GetMapping("/form_pet_find")
    public String form_pet_find() {
        return "form_pet_find";
    }

    @GetMapping("/login")
    public String login() {
        return "InicioSesion";
    }

    @GetMapping("/loginadmin")
    public String LoginAdmin(Model model) {
        var usuarios = usuarioDAO.findAll();
        model.addAttribute("usuarios", usuarios);
        return "loginadmin";
    }

    @GetMapping("/pet_detail")
    public String pet_detail() {
        return "pet_detail";
    }

    @GetMapping("/user_register")
    public String user_register() {
        return "user_register";
    }

    @PostMapping("/guardar")
    public String guardar(Usuario usuarioGuardar) {
        usuarioDAO.save(usuarioGuardar);
        return "redirect:/RegistroMascotaPerdidaEncontrada?Exito";
    }

    @GetMapping("/editarUsuario/{id_usuario}")
    public String editarUsuario(@PathVariable int id_usuario, Model model ) {
        var usuarios = usuarioDAO.findById(id_usuario);
        model.addAttribute("usuarios", usuarios);
        return "actualizaUsuario";
    }
    
    @GetMapping("/eliminarUsuario/{id_usuario}")
    public String eliminarUsuario(@PathVariable("id_usuario") Integer id_usuario) {
        usuarioDAO.deleteById(id_usuario);
        return "redirect:/loginadmin";
    }

    @GetMapping("/detalleMascota/{id_mascota}")
    public String detalleMascota(@PathVariable int id_mascota, Model model ) {
        var mascotas = mascotaDAO.findById(id_mascota);
        model.addAttribute("mascotas", mascotas);
        return "pet_detail";
    }
}
