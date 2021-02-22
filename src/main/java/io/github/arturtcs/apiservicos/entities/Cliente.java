package io.github.arturtcs.apiservicos.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;
}
