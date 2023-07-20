package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Empleados {
  private String cedula;
  private String apellidos;
  private String nombres;
  private String numeroDeCuenta;  
}
