package com.projeto.emprestimo.emprestimo.model;

import jakarta.persistence.*;

@Entity
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank(message = "Obrigatório")
    @Column(nullable = false, unique = true)
    private String patrimonio;
    //@NotBlank(message = "Obrigatório")
    @Column(nullable = false)
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEquipamento tipo;
    @Column(nullable = false)
    private boolean disponivel = true;

    public Equipamento() { }
    // getters e setters no próximo slide
}