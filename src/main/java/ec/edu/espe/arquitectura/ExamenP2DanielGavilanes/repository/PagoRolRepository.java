package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model.PagoRol;

public interface PagoRolRepository extends MongoRepository<PagoRol, String> {
    
}
