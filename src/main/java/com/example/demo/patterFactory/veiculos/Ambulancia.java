package com.example.demo.patterFactory.veiculos;

import java.math.BigDecimal;

import com.example.demo.modelo.Pedagio;
import com.example.demo.patterFactory.contrato.CalcularPedagio;

public class Ambulancia implements CalcularPedagio{
    
    @Override
    public Pedagio calcularPedagio() {
        Pedagio pedagio = new Pedagio("Ambulancia", new BigDecimal(0.00));
        return pedagio;
    }
}
