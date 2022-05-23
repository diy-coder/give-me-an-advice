package com.diycoder.smallaps.givemeanadvice.controller;

import com.diycoder.smallaps.givemeanadvice.service.BaseServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T, P> {

    private BaseServiceInterface<T, P> service;

    public BaseController(BaseServiceInterface service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public T getById(@PathVariable("id") P id) {
        return this.service.getById(id);
    }

    @PostMapping
    public T save(@RequestBody T obj) {
        return this.service.save(obj);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") P id) {
        this.service.delete(id);
    }
}
