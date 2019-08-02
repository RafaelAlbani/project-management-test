package br.com.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.entities.Projeto;
import br.com.biblioteca.repositories.ProjetoRepository;

@Service
public class ProjetoService implements IProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;
	
	@Override
	public List<Projeto> findAll() {
		return (List<Projeto>) projetoRepository.findAll();
	}

}
