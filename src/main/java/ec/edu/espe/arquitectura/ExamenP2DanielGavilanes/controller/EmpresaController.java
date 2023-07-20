package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto.EmpresaDto;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.service.EmpresaService;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

  @PostMapping 
    public ResponseEntity createEmpresa(@RequestBody EmpresaDto empresaDto) {
        this.empresaService.createEmpresa(empresaDto);
        return ResponseEntity.ok().build();
    } 
}
