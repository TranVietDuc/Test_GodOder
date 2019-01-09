package com.codegym.godorder.service;

import com.codegym.godorder.model.Thing;

public interface ThingsService {
    Iterable<Thing> findAll();
    Thing findById(Long id);
    void save(Thing godOrder);
}
