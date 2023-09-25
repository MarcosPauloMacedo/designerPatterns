package com.example.demo.patterFactory.fabrica;

import com.example.demo.patterFactory.contrato.CalcularPedagio;
import com.example.demo.patterFactory.veiculos.Ambulancia;
import com.example.demo.patterFactory.veiculos.Caminhao;
import com.example.demo.patterFactory.veiculos.Carro;
import com.example.demo.patterFactory.veiculos.Motocicleta;
import com.example.demo.patterFactory.veiculos.Onibus;
import com.example.demo.patterFactory.veiculos.Rodotrem;

public class FabricaCalcularPedagio {
    public static CalcularPedagio getCalcularPedagio(String tipoVeiculo) {
        switch (tipoVeiculo.toLowerCase()) {
            case "carro":
                return new Carro();
            case "motocicleta":
                return new Motocicleta();
            case "caminhao":
                return new Caminhao();
            case "onibus":
                return new Onibus();
            case "ambulancia":
                return new Ambulancia();
            case "rodotrem":
                return new Rodotrem();
            default:
                return null;
        }
    }
}
