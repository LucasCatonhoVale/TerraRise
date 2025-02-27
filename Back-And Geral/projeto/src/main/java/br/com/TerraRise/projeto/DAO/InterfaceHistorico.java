package br.com.TerraRise.projeto.DAO;

import br.com.TerraRise.projeto.Entity.Historico;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceHistorico extends CrudRepository<Historico,Long> {
}
