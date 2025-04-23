package com.lectorium.services.impl;

import org.springframework.stereotype.Service;

import com.lectorium.model.Author;
import com.lectorium.repository.IAuthorRepo;
import com.lectorium.repository.IGenericRepo;
import com.lectorium.services.IAuthorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService extends GenericService<Author, Integer> implements IAuthorService {

    protected final IAuthorRepo repo;

    protected IGenericRepo<Author, Integer> getRepo() {
        return repo;
    }

}
