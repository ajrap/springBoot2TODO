package com.valdir.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.todo.domain.Todo;
import com.valdir.todo.repository.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todorepository;

	public void instanciaBancoDeDados() throws ParseException {
//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Anular 11", sdf.parse("25/03/2022"), false);
//		Todo t2 = new Todo(null, "Ler", "Ler livro de desempenho individual",
//				sdf.parse("22/03/2021"), true);
//		Todo t3 = new Todo(null, "Exercícios", "Praticar exercícios físicos",
//				sdf.parse("21/03/2022"), false);
//		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã",
//				sdf.parse("27/03/2021"), true);
//		Todo t5 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã",
//				sdf.parse("27/03/2021"), true);
//		Todo t6 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã",
//				sdf.parse("27/03/2021"), false);
//
//		todorepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
