package br.org.meuvoto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import br.org.meuvoto.Pessoa;

@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
	
}