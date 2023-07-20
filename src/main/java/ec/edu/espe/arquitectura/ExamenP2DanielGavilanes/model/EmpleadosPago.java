package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpleadosPago {
    private String numeroCuenta;
    private BigDecimal valor;
    private String estado;
    
}
