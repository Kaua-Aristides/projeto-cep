package kaua_aristides.padroes_projeto_spring.service;

import kaua_aristides.padroes_projeto_spring.entities.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id);
	
	void deletar(Long id);

}
