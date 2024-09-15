package com.example.microservice.infrastructure.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.microservice.domain.dynamodb.PrecoCalculado;
import com.example.microservice.domain.request.SolicitacaoCalculoRequest;
import com.example.microservice.application.CalcularPrecoUseCase;

@RestController
@RequestMapping("/precificacao")
public class PrecificacaoController {

    private final CalcularPrecoUseCase calcularPrecoUseCase;

    public PrecificacaoController(CalcularPrecoUseCase calcularPrecoUseCase) {
        this.calcularPrecoUseCase = calcularPrecoUseCase;
    }

    @PostMapping("/calcular")
    public ResponseEntity<PrecoCalculado> calcularPreco(@RequestBody SolicitacaoCalculoRequest request) {
        PrecoCalculado precoCalculado = calcularPrecoUseCase.execute(request);
        return ResponseEntity.ok(precoCalculado);
    }
}
