package br.com.TerraRise.projeto.Controller;

import br.com.TerraRise.projeto.DAO.InterfacePlanta;
import br.com.TerraRise.projeto.Entity.Planta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/planta")
public class PlantaController {
    @Autowired
    private InterfacePlanta dao;
    @GetMapping
    public List<Planta>listarPlanta(){
        return (List<Planta>) dao.findAll();
    }

    @PostMapping
    public Planta criarPlanta(@RequestBody Planta planta){
        Planta plantaNovo=dao.save(planta);
        return plantaNovo;
    }
}
