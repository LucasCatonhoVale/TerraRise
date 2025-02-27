package br.com.TerraRise.projeto.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Planta")
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_planta")
    private Long id_planta;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Quantidade")
    private String quantidade;


}
