package br.com.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.biblioteca.entities.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Long> {

}
