package com.example.demo.patterFactory.veiculos;

import java.math.BigDecimal;

import com.example.demo.modelo.Pedagio;
import com.example.demo.patterFactory.contrato.CalcularPedagio;

public class Carro implements CalcularPedagio {

    @Override
    public Pedagio calcularPedagio() {
        Pedagio pedagio = new Pedagio("Carro", new BigDecimal(10.00));
        return pedagio;
    }
}
