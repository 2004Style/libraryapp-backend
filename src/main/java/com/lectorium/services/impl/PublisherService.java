package com.lectorium.services.impl;

// import java.util.List;

import org.springframework.stereotype.Service;

import com.lectorium.model.Publisher;
import com.lectorium.repository.IGenericRepo;
import com.lectorium.repository.IPublisherRepo;
// import com.lectorium.repository.IPublisherRepo;
// import com.lectorium.repository.PublisherRepo;
import com.lectorium.services.IpublisherService;

import lombok.AllArgsConstructor;
// import lombok.AllArgsConstructor;
// import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
// @RequiredArgsConstructor
public class PublisherService extends GenericService<Publisher, Integer> implements IpublisherService {
	private final IPublisherRepo repo;

	protected IGenericRepo<Publisher, Integer> getRepo() {
		return repo;
	}
}


// public class PublisherService implements IpublisherService {
//    //@Autowired
// 	private IPublisherRepo repo;

// 	@Override
// 	public Publisher save(Publisher publisher) throws Exception {
// 		return repo.save(publisher);
// 	}

// 	@Override
// 	public Publisher update(Publisher publisher, Integer id) throws Exception {
// 		// Evaluar el ID para actualizar luego
// 		publisher.setIdPublisher(id);
// 		return repo.save(publisher);
// 	}

// 	@Override
// 	public List<Publisher> findAll() throws Exception {
// 		return repo.findAll();
// 	}

// 	@Override
// 	public Publisher findById(Integer id) throws Exception {
// 		return repo.findById(id).orElse(new Publisher());
// 	}

// 	@Override
// 	public void delete(Integer id) throws Exception {
// 		repo.deleteById(id);
// 	}
// }
