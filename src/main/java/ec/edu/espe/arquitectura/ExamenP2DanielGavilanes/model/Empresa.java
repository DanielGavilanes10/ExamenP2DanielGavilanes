package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "empresa")
public class Empresa {
    @Id
    private String id;
    @Indexed(unique = true)
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleados> empleados;
}
