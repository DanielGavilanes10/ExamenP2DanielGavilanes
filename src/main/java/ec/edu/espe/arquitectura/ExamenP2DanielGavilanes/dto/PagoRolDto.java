package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model.EmpleadosPago;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PagoRolDto {
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private List<EmpleadosPago> empleadosPagos;
}
