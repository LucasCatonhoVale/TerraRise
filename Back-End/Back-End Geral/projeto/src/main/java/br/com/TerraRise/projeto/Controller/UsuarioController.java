package br.com.TerraRise.projeto.Controller;

import br.com.TerraRise.projeto.DAO.InterfaceUsuario;
import br.com.TerraRise.projeto.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private InterfaceUsuario dao;
    @GetMapping
    public List<Usuario>listarUsuario(){
        return (List<Usuario>)dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo=dao.save(usuario);
        return usuarioNovo;
    }

}
