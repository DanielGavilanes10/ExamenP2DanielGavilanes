package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto.EmpresaDto;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto.PagoRolDto;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model.Empresa;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model.PagoRol;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.repository.PagoRolRepository;

@Service
public class PagoRolService {

    private final PagoRolRepository pagoRolRepository;

    public PagoRolService(PagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }
    
    
       public PagoRolDto createPagoRol(PagoRolDto pagoRolDto) {

        PagoRol pagoRol = this.convertToEntity(pagoRolDto);
        PagoRol pagoRolSave =this.empresaRepository.save(pagoRol);
        return this.convertToDto(pagoRolSave);

    } 

    private PagoRol  convertToEntity(PagoRolDto pagoRolDto){

        PagoRol pagoRol = new PagoRol();
        pagoRol.setMes(pagoRolDto.getMes());
        pagoRol.setFechaProceso(pagoRolDto.getFechaProceso());
        pagoRol.setCuentaPrincipal(pagoRolDto.getCuentaPrincipal());
        pagoRol.setValorTotal(null);
        pagoRol.setValorReal(0);
        pagoRol.setEmpleadosPagos(pagoRolDto.getEmpleadosPagos());
        return pagoRol;
    }

        private PagoRolDto   convertToDto(PagoRol pagoRol){

        PagoRolDto pagoRolDto = new PagoRolDto();
        pagoRolDto.setMes(pagoRol.getMes());
        pagoRolDto.setFechaProceso(pagoRol.getFechaProceso());
        pagoRolDto.setCuentaPrincipal(pagoRol.getCuentaPrincipal());
        pagoRolDto.setEmpleadosPagos(pagoRol.getEmpleadosPagos());
        return pagoRolDto;
    }

}
