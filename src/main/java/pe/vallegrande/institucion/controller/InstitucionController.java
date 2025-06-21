package pe.vallegrande.institucion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.vallegrande.institucion.dto.InstitucionDTO;

@RestController
@RequestMapping("/prueba")
public class InstitucionController {

    @GetMapping
    public InstitucionDTO getInstitucion() {
        return new InstitucionDTO("20215276024", "UPN", "omar.rivera@utp.edu.pe");
    }
}
