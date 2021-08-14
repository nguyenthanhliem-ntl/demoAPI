package com.example.demoapi.service.home;

import com.example.demoapi.model.Home;
import com.example.demoapi.reposiory.IHomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeService implements IHomeService{

    @Autowired
    private IHomeRepo homeRepo;

    @Override
    public Iterable<Home> findAll() {
        return homeRepo.findAll();
    }

    @Override
    public Optional<Home> findById(Long id) {
        return homeRepo.findById(id);
    }

    @Override
    public void save(Home home) {
        homeRepo.save(home);
    }

    @Override
    public void remove(Long id) {
        homeRepo.deleteById(id);
    }

    @Override
    public Optional<Home> findByName(String name) {
        return homeRepo.findByName(name);
    }
}
