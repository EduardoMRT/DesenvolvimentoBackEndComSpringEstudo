package br.com.eduardo.drogaria2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/drogaria2") // diz que a classe é um controlador, que ira gerar serviçs no futuro
public class DrogariaController {
	
@GetMapping(value = "/ola") //serve para quando você quer transformar um método em um serviço
	public String exibirMensagem() {
		return "Olá mundo";
	}
}
