package com.error.Services.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prestador")
public class PrestadorController {
	
@GetMapping("/cadastrar")
public String cadastrar() {
		return "/prestador/cadastro";
	}
}
