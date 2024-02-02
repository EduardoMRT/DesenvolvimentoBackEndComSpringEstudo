package br.com.eduardo.drogaria2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // diz que a classe é um controlador, que ira gerar serviçs no futuro
@RequestMapping("/drogaria2") // dizer qual é o caminho
public class DrogariaController {
	
@GetMapping("/ola") //serve para quando você quer transformar um método em um serviço
	public String exibirMensagem() {
		return "Hello World";
	}
}
