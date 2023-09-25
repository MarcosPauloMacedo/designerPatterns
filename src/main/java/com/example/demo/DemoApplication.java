package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.patterFactory.contrato.CalcularPedagio;
import com.example.demo.patterFactory.fabrica.FabricaCalcularPedagio;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String tipoVeiculo = "motocicleta";
		CalcularPedagio calcularPedagio = FabricaCalcularPedagio.getCalcularPedagio(tipoVeiculo);
		System.out.println(calcularPedagio.calcularPedagio());
	}
}
