package br.com.TerraRise.projeto.Controller;

import br.com.TerraRise.projeto.DAO.InterfaceHistorico;
import br.com.TerraRise.projeto.Entity.Historico;
import br.com.TerraRise.projeto.Entity.HistoricoDTO;
import br.com.TerraRise.projeto.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/historico")
public class HistoricoController {
    @Autowired
    private InterfaceHistorico dao;

    @GetMapping
    public List<HistoricoDTO> listarHistorico() {
        List<Historico> historicos = (List<Historico>) dao.findAll();
        return historicos.stream()
                .map(HistoricoDTO::new)
                .collect(Collectors.toList());
    }
    @PostMapping
    public Historico criarUsuario(@RequestBody Historico historico){
        Historico historiconovo=dao.save(historico);
        return historiconovo;
    }
}
