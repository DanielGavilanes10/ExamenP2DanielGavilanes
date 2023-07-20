package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto.EmpresaDto;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model.Empresa;
import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.repository.EmpresaRepository;
@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;
    
     public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }



    public EmpresaDto createEmpresa(EmpresaDto empresaDto) {

        Empresa empresa = this.convertToEntity(empresaDto);
        Empresa empresaSave =this.empresaRepository.save(empresa);
        return this.convertToDto(empresaSave);

    } 
    
    


    private Empresa  convertToEntity(EmpresaDto empresaDto){

        Empresa empresa = new Empresa();
        empresa.setRuc(empresaDto.getRuc());
        empresa.setRazonSocial(empresaDto.getRazonSocial());
        empresa.setCuentaPrincipal(empresaDto.getCuentaPrincipal());
        empresa.setEmpleados(empresaDto.getEmpleados());
        return empresa;
    }

        private EmpresaDto  convertToDto(Empresa empresa){

        EmpresaDto empresaDto = new EmpresaDto();
        empresaDto.setRuc(empresa.getRuc());
        empresaDto.setRazonSocial(empresa.getRazonSocial());
        empresaDto.setCuentaPrincipal(empresa.getCuentaPrincipal());
        empresaDto.setEmpleados(empresa.getEmpleados());
 
        return empresaDto;
    }
}

