package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto.EmpresaDto;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto.PagoRolDto;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.service.PagoRolService;

@Service
public class PagoRolController {
    private final PagoRolService pagoRolService;

    public PagoRolController(PagoRolService pagoRolService) {
        this.pagoRolService = pagoRolService;
    }
      @PostMapping 
    public ResponseEntity createPagoRol(@RequestBody PagoRolDto pagoRolDto) {
        this.pagoRolService.createPagoRol(pagoRolDto);
        return ResponseEntity.ok().build();
    } 
}

