package com.lectorium.services.impl;

import java.util.List;

import com.lectorium.repository.IGenericRepo;
import com.lectorium.services.IGenericService;


public abstract class GenericService<T, ID> implements IGenericService<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo(); 

    @Override
    public T save(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public T update(T t, ID id) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) throws Exception {
        getRepo().deleteById(id);;
    }    
}
