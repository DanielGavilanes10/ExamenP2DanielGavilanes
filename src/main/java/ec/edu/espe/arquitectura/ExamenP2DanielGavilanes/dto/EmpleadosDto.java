package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class EmpleadosDto {
  private String cedula;
  private String apellidos;
  private String nombres;
  private String numeroDeCuenta;   
}
