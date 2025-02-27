package br.com.TerraRise.projeto.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Vaso")
public class Vaso {
    @Id
    @Column(name = "id_vaso")
    private Long id_vaso;

    @Column(name = "vaso")
    private String vaso;

    @ManyToOne
    @JoinColumn(name = "id_planta")
    private Planta planta;


}
