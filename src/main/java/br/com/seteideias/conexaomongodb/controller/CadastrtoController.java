package br.com.seteideias.conexaomongodb.controller;

import br.com.seteideias.conexaomongodb.entity.Usuario;
import br.com.seteideias.conexaomongodb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1")
@RestController
public class CadastrtoController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuarionovo")
    public void cadastroDeUsuario(@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
    }

    @GetMapping("/usuario")
    public List<Usuario> findAllUsuarios() {
        return usuarioService.findAll();
    }

}
