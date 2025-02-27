package br.com.TerraRise.projeto.Controller;

import br.com.TerraRise.projeto.DAO.InterfacePlanta;
import br.com.TerraRise.projeto.DAO.InterfaceVaso;
import br.com.TerraRise.projeto.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/vaso")
public class VasoController {
    @Autowired
    private InterfaceVaso  dao;

    @Autowired
    private  InterfacePlanta plantadao;

    @GetMapping
    public List<VasoDTO> listarVaso() {
        List<Vaso> historicos = (List<Vaso>) dao.findAll();
        return historicos.stream()
                .map(VasoDTO::new)
                .collect(Collectors.toList());
    }
    @PutMapping("{idVaso}/{idPlanta}")
    public String atualizarIdPlanta(@PathVariable Long idVaso, @PathVariable Long idPlanta) {
        Planta planta = plantadao.findById(idPlanta).orElse(null);
        if (planta.getId_planta() == 1L) {
            dao.updateIdPlanta(planta, idVaso);
            return "Cadastro do Vaso deletado";
        }
        else {
            dao.updateIdPlanta(planta, idVaso);
            return "Planta Cadastrada com Suceso";
        }
    }

}
