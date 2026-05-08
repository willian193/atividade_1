package com.example.atividade_1.controller;


import com.example.atividade_1.model.Aluno;
import com.example.atividade_1.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Alunos")
@RestController

public class AlunoController {
    private final AlunoService service;

@GetMapping
    public List<Aluno> listar(){
        return service.Listar();
}

@GetMapping("/{id}")
    public ResponseEntity<Aluno> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
}

    @PostMapping
    public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno){
        return  ResponseEntity.ok(service.salvar(aluno));
    }

    public ResponseEntity<Aluno> atualizar(@PathVariable Long id,
                                            @RequestBody Aluno dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
