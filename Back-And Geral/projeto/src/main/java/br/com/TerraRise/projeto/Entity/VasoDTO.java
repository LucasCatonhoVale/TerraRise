package br.com.TerraRise.projeto.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VasoDTO {
    private Long id_vaso;
    private String vasos;
    private String nomePlanta;

    public VasoDTO(Vaso vaso){
        id_vaso=vaso.getId_vaso();
        vasos=vaso.getVaso();
        nomePlanta=vaso.getPlanta() != null ? vaso.getPlanta().getNome():null;
    }
}
