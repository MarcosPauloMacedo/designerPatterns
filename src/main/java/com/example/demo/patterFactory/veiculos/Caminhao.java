package com.example.demo.patterFactory.veiculos;

import java.math.BigDecimal;

import com.example.demo.modelo.Pedagio;
import com.example.demo.patterFactory.contrato.CalcularPedagio;

public class Caminhao implements CalcularPedagio{

    @Override
    public Pedagio calcularPedagio() {
        Pedagio pedagio = new Pedagio("Caminhao", new BigDecimal(20.00));
        return pedagio;
    }
}
