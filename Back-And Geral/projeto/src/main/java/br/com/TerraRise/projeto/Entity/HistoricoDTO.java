package br.com.TerraRise.projeto.Entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
public class HistoricoDTO {
    private Long id_historico;
    private String data;
    private String hora;
    private String nomeVaso;

    public HistoricoDTO(Historico historico) {
        id_historico = historico.getId_historico();
        data = historico.getData();
        hora = historico.getHora();
        nomeVaso = historico.getVaso() != null ? historico.getVaso().getVaso() : null;
    }
}
