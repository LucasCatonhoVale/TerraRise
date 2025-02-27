package br.com.TerraRise.projeto.DAO;

import br.com.TerraRise.projeto.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InterfaceUsuario extends CrudRepository<Usuario,Long> {
  Optional<Usuario> findByEmailAndSenha(String email,String senha);
}
