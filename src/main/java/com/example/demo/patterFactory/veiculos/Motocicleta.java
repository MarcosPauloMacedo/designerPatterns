package com.example.demo.patterFactory.veiculos;

import java.math.BigDecimal;
import com.example.demo.modelo.Pedagio;
import com.example.demo.patterFactory.contrato.CalcularPedagio;

public class Motocicleta implements CalcularPedagio{
    
    @Override
    public Pedagio calcularPedagio() {
        Pedagio pedagio = new Pedagio("Motocicleta", new BigDecimal(5.00));
        return pedagio;
    }
}
