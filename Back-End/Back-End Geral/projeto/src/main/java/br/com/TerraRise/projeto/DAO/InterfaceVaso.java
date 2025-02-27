package br.com.TerraRise.projeto.DAO;

import br.com.TerraRise.projeto.Entity.Planta;
import br.com.TerraRise.projeto.Entity.Vaso;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface InterfaceVaso extends CrudRepository<Vaso,Long> {
    @Modifying
    @Query("UPDATE Vaso v SET v.planta = :planta WHERE v.id_vaso = :idVaso")
    @Transactional
    void updateIdPlanta(@Param("planta") Planta planta, @Param("idVaso") Long idVaso);

}
