package com.lectorium.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lectorium.model.Author;
import com.lectorium.services.IAuthorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/authors")
// @AllArgsConstructor
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthorController {
//@Autowired
	private final IAuthorService service;
	
	@GetMapping
	public ResponseEntity<List<Author>> findAll() throws Exception{
		List<Author> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Author> findById(@PathVariable("id") Integer id) throws Exception{
		Author obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	@PostMapping
	public ResponseEntity<Author> save(@RequestBody Author author) throws Exception{
		Author obj = service.save(author);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdAuthor()).toUri();
		return ResponseEntity.created(location).body(obj);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Author> update(@PathVariable("id") Integer id, @RequestBody Author author) throws Exception{
		Author obj = service.update(author, id);
		return ResponseEntity.ok(obj);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
		service.delete(id);		
		return ResponseEntity.ok().build();
	}
}
