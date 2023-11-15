package com.colabuco.aprendendospring.model;

import java.util.ArrayList;
import jakarta.persistence.*;

//@Entity jackarta.persistence -> para declarar que cliente seria uma entidade
@Entity
public class Cliente {
    //anotação para declarar que é uma priory key
    @Id
    //para setar de forma automatica ids(de maneira sequencial)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //para indicar que esse atributo não aceita valores nullos
    @Column(nullable = false)
    private String nome;
    //para representar relações entre classes e com esse parâmetro, declkaramos que um faz o que o outro faz
    //ex.: se um é excluído, o outro também
    @OneToMany(mappedBy = "conta", cascade = CascadeType.ALL, orphanRemoval = true)
    //criando uma chave estrangeira
    private ArrayList<Conta> contas;
}
