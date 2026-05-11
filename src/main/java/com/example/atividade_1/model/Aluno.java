package com.example.atividade_1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String nome ;
    private String curso ;
    private String matricula ;
}
