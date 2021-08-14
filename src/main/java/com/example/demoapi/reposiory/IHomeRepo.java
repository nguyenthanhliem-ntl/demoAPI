package com.example.demoapi.reposiory;

import com.example.demoapi.model.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IHomeRepo extends CrudRepository<Home,Long> {

    Optional<Home> findByName(String name);
}
