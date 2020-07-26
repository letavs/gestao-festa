package com.algawork.festa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algawork.festa.model.Convidado;
import com.algawork.festa.model.Convidados;

@SpringBootApplication
public class GestaoFestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoFestaApplication.class, args);
	}
	@RequestMapping("/")
	String index() {
		return "index";
	}
	@RequestMapping("/convidados")
	String lista() {
		return "ListaConvidados";
	}
}
