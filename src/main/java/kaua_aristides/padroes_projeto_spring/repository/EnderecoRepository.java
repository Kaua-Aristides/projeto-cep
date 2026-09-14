package kaua_aristides.padroes_projeto_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kaua_aristides.padroes_projeto_spring.entities.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
