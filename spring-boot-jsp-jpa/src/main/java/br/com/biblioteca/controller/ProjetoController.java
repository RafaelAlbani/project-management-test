package br.com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.entities.Projeto;
import br.com.biblioteca.services.IProjetoService;

@RestController
public class ProjetoController {
	
	@Autowired
    private IProjetoService projetoService;
	
	@RequestMapping(value = "/projetos",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Projeto>> getAllProjects() throws Exception {
		
		List<Projeto> projects = (List<Projeto>) projetoService.findAll();
		
		return new ResponseEntity<List<Projeto>>(projects, HttpStatus.OK);
	}

}
