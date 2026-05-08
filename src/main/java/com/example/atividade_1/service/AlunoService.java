package com.example.atividade_1.service;

import com.example.atividade_1.model.Aluno;
import lombok.RequiredArgsConstructor;
import com.example.atividade_1.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AlunoService {

    private final AlunoRepository repository;

public List<Aluno> Listar(){
    return repository.findAll();
}

public Aluno buscarPorId(Long Id){
    return repository.findById(Id)
            .orElseThrow (() -> new RuntimeException("Aluno Não encontrado"));
}

public Aluno salvar (Aluno aluno){
    return repository.save(aluno);
}

public Aluno atualizar (Long id , Aluno dados){
    Aluno aluno = buscarPorId(id);
            aluno.setNome(dados.getNome());
            aluno.setCurso(dados.getCurso());
            aluno.setMatricula(dados.getMatricula());
        return repository.save(aluno);
}

    public void excluir(Long id){
        repository.deleteById(id);
    }
}
