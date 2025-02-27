package br.com.TerraRise.projeto.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@Table(name = "Historico")
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_historico",columnDefinition = "BIGINT")
    private Long id_historico;

    @Column(name = "Data")
    private String Data;

    @Column(name = "Hora")
    private String Hora; // Renomeado para seguir a convenção Java

    @ManyToOne
    @JoinColumn(name = "id_vaso") // Corrigido para referenciar a coluna correta
    private Vaso vaso;


}