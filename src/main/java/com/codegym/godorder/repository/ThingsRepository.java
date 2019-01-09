package com.codegym.godorder.repository;

import com.codegym.godorder.model.Thing;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ThingsRepository extends PagingAndSortingRepository<Thing,Long> {
}
