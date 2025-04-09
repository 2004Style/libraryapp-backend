package com.lectorium.services;

import org.springframework.stereotype.Service;

import com.lectorium.model.Publisher;
import com.lectorium.repository.IPublisherRepo;
// import com.lectorium.repository.PublisherRepo;

// import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
// @AllArgsConstructor
@RequiredArgsConstructor
public class PublisherService implements IpublisherService {
    private final IPublisherRepo repo;

    @Override
    public Publisher saveAndValid(Publisher publisher) {
        // repo = new PublisherRepo();
        if (publisher.getIdPublisher() > 0) {
            return repo.save(publisher);
        } else {
            return new Publisher();
        }
    }
}
