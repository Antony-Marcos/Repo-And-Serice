package com.colabuco.aprendendospring.model;

import jakarta.persistence.*;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String numConta;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;
}

//Numa conta de 1 pra N -> Propietário da relação é a classe N


