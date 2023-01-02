package br.com.seteideias.conexaomongodb.repository;

import br.com.seteideias.conexaomongodb.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConexaoMongo extends MongoRepository<Usuario,String> {
}
