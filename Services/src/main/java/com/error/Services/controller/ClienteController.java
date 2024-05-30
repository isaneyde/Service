package com.error.Services.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/cliente/cadastro";
	}


@GetMapping("/solicitar")
public String solicitar() {
	return "/cliente/solicitar";
}


}
