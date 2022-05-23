package com.diycoder.smallaps.givemeanadvice.service;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public class BaseService<T, P> implements BaseServiceInterface<T, P> {

    private PagingAndSortingRepository<T, P> repository;

    public BaseService(PagingAndSortingRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return (List<T>) this.repository.findAll();
    }

    @Override
    public T getById(P p) {
        return this.repository.findById(p).orElseThrow(() -> new RuntimeException("Registro nao encontrado"));
    }

    @Override
    public T save(T t) {
        return this.repository.save(t);
    }

    @Override
    public void delete(P p) {
        T t = this.getById(p);
        this.repository.delete(t);
    }
}
