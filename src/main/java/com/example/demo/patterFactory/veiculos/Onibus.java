package com.example.demo.patterFactory.veiculos;

import java.math.BigDecimal;

import com.example.demo.modelo.Pedagio;
import com.example.demo.patterFactory.contrato.CalcularPedagio;

public class Onibus implements CalcularPedagio {

    @Override
    public Pedagio calcularPedagio() {
        Pedagio pedagio = new Pedagio("Onibus", new BigDecimal(15.00));
        return pedagio;
    }
}
