package br.com.seteideias.conexaomongodb.service;

import br.com.seteideias.conexaomongodb.entity.Usuario;
import br.com.seteideias.conexaomongodb.repository.ConexaoMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private ConexaoMongo conexaoMongo;

    public void cadastrarUsuario(Usuario usuario){
        conexaoMongo.save(usuario);
    }

    public List<Usuario> findAll (){
        return conexaoMongo.findAll();
    }

}
