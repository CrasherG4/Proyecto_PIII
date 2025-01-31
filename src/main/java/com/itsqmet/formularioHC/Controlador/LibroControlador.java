package com.itsqmet.formularioHC.Controlador;

import com.itsqmet.formularioHC.Entidad.Libro;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.LocalDate;

@Controller
public class LibroControlador {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        Libro libro = new Libro();
        model.addAttribute("libro", libro);
        return "pages/formulario";
    }

    @PostMapping("/registrar")
    public String registrarLibro(@Valid @ModelAttribute Libro libro, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "pages/formulario";
        }else{
            LocalDate fechaActual = LocalDate.now();
            model.addAttribute("fechaActual", fechaActual);

            return "pages/registroExitoso";
        }
    }
}
