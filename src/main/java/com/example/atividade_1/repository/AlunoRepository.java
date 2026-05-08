package com.example.atividade_1.repository;

import com.example.atividade_1.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

