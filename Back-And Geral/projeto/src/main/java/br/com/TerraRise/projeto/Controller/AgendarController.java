package br.com.TerraRise.projeto.Controller;

import br.com.TerraRise.projeto.DAO.InterfaceAgendar;
import br.com.TerraRise.projeto.Entity.Agendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/agendar")
public class AgendarController {

    @Autowired
    private InterfaceAgendar dao;

    @GetMapping
   public List<Agendar>listaAgenda(){
        return (List<Agendar>) dao.findAll();
    }

    @PostMapping
    public Agendar criarAgenda(@RequestBody Agendar agendar){
        Agendar agendarNovo=dao.save(agendar);
        return agendarNovo;
    }
}
