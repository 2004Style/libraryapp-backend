package com.lectorium.repository;

import org.springframework.stereotype.Repository;

import com.lectorium.model.Publisher;

@Repository
public class PublisherRepo implements IPublisherRepo {
    @Override
    public Publisher save(Publisher publisher) {
        System.out.println("publisher save to");
        return publisher;
    }
}
