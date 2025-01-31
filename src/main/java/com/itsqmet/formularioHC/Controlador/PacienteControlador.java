package com.itsqmet.formularioHC.Controlador;

import com.itsqmet.formularioHC.Entidad.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteControlador {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        Paciente paciente = new Paciente();
        model.addAttribute("paciente", paciente);
        return "pages/formulario";
    }

    @PostMapping("/registrar")
    public String registrarPaciente(@Valid @ModelAttribute Paciente paciente, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "pages/formulario";
        }else{
            return "pages/registroExitoso";
        }
    }
}
