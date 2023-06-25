package com.digytal.myapidoc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digytal.myapidoc.entities.AlunoEntitie;

@RestController
public class AlunoController {
	
	@GetMapping(value = "/aluno")
	public AlunoEntitie getAluno() {
		
		AlunoEntitie tiberio = new AlunoEntitie(
												"TIBERIO",
												"LIMA"
				                               );
		
		return tiberio;
		
	}

}
