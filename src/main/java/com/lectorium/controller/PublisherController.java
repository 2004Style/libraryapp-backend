package com.lectorium.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lectorium.model.Publisher;
import com.lectorium.services.IpublisherService;
import lombok.RequiredArgsConstructor;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//http://localhost:8081/publishers
@RestController
@RequestMapping("/publishers")
//@AllArgsConstructor
 @RequiredArgsConstructor
 @CrossOrigin(origins = "*")
public class PublisherController {
    //@Autowired
	private final IpublisherService service;
	
	@GetMapping
	public ResponseEntity<List<Publisher>> findAll() throws Exception{
		List<Publisher> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Publisher> findById(@PathVariable("id") Integer id) throws Exception{
		Publisher obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	@PostMapping
	public ResponseEntity<Publisher> save(@RequestBody Publisher publisher) throws Exception{
		Publisher obj = service.save(publisher);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdPublisher()).toUri();
		return ResponseEntity.created(location).body(obj);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Publisher> update(@PathVariable("id") Integer id, @RequestBody Publisher publisher) throws Exception{
		Publisher obj = service.update(publisher, id);
		return ResponseEntity.ok(obj);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
		service.delete(id);		
		return ResponseEntity.ok().build();
	}
}