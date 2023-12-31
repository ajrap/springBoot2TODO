package com.valdir.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.todo.domain.Todo;
import com.valdir.todo.repository.TodoRepository;

import com.valdir.todo.services.exceptions.*;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo findById(Integer id) {

		Optional<Todo> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo:  " + Todo.class.getName()));

	}

	public List<Todo> findAllOpen() {
		List<Todo> list = repository.findAllOpen();

		return list;
	}

	public List<Todo> findAllClosed() {
		List<Todo> list = repository.findAllClosed();

		return list;
	}

	public List<Todo> findAll() {
		// Metodo já implementado
		List<Todo> list = repository.findAll();

		return list;
	}

	public Todo create(Todo obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
		// metodo já implementado
		repository.deleteById(id);
	}

	public Todo update(Integer id, Todo obj) {
		Todo newObj = findById(id);
		newObj.setTitulo(obj.getTitulo());
		newObj.setDataParaFinalizar(obj.getDataParaFinalizar());
		newObj.setDescricao(obj.getDescricao());
		newObj.setFinalizado(obj.getFinalizado());
		
		return repository.save(newObj);
	}

}
