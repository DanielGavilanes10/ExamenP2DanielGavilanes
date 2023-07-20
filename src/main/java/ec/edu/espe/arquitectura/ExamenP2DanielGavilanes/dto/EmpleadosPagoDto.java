package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class EmpleadosPagoDto {
    private String numeroCuenta;
    private BigDecimal valor;
    

}
