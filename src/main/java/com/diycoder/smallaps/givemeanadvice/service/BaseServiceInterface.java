package com.diycoder.smallaps.givemeanadvice.service;

import java.util.List;

public interface BaseServiceInterface<T, P> {
    List<T> getAll();
    T getById(P p);
    T save(T t);
    void delete(P p);
}
