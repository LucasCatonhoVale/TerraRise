package br.com.TerraRise.projeto.DAO;

import br.com.TerraRise.projeto.Entity.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface InterfacePlanta extends CrudRepository<Planta,Long> {
    @Query("SELECT p FROM Planta p WHERE p.id_planta = :idPlanta")
    Optional<Planta> findById(@Param("idPlanta") Long idPlanta);

}
