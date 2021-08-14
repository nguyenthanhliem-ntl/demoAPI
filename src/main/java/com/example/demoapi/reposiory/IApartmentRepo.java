package com.example.demoapi.reposiory;

import com.example.demoapi.model.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApartmentRepo extends CrudRepository<Apartment,Long> {
}
