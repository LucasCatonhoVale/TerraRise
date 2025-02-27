package br.com.TerraRise.projeto.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Email")
    private String email;

    @Column(name = "Senha")
    private String senha;

    @Column(name = "Telefone")
    private String telefone;

    @Column(name = "Endereço")
    private String endereco;

}
