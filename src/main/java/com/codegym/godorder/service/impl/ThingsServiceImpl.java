package com.codegym.godorder.service.impl;

import com.codegym.godorder.model.Thing;
import com.codegym.godorder.repository.ThingsRepository;
import com.codegym.godorder.service.ThingsService;
import org.springframework.beans.factory.annotation.Autowired;

public class ThingsServiceImpl implements ThingsService {

    @Autowired
    private ThingsRepository thingsRepository;

    @Override
    public Iterable<Thing> findAll() {
        return thingsRepository.findAll();
    }

    @Override
    public Thing findById(Long id) {
        return thingsRepository.findOne(id);
    }

    @Override
    public void save(Thing thing) {
        thingsRepository.save(thing);
    }
}
