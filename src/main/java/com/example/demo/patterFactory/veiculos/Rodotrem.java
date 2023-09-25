package com.example.demo.patterFactory.veiculos;

import java.math.BigDecimal;

import com.example.demo.modelo.Pedagio;
import com.example.demo.patterFactory.contrato.CalcularPedagio;

public class Rodotrem implements CalcularPedagio {
    
    @Override
    public Pedagio calcularPedagio() {
        Pedagio pedagio = new Pedagio("Rodotrem", new BigDecimal(45.00));
        return pedagio;
    }
}
