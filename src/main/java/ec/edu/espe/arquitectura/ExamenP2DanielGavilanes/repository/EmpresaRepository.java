package ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.ExamenP2DanielGavilanes.model.Empresa;

public interface EmpresaRepository extends MongoRepository<Empresa, String> {
    
}
