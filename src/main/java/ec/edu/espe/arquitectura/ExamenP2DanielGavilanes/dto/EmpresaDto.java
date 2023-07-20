package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class EmpresaDto {
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<EmpleadosDto> empleados;
}
