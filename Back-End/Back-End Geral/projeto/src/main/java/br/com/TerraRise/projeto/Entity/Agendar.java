package br.com.TerraRise.projeto.Entity;

import br.com.TerraRise.projeto.EnumAgendar;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Agendar")
public class Agendar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_agendar", columnDefinition = "BIGINT")
    private Long id_agendar;

    @Column(name = "Data")
    private String data;

    @Column(name = "Hora")
    private String hora;

    @Enumerated(EnumType.STRING)
    @Column(name = "vaso")
    private EnumAgendar vaso;
}