package com.example.demoapi.service.Apartment;

import com.example.demoapi.model.Apartment;
import com.example.demoapi.reposiory.IApartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ApartmentService implements IApartmentService {

    @Autowired
    private IApartmentRepo apartmentRepo;

    @Override
    public Iterable<Apartment> findAll() {
        return apartmentRepo.findAll();
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return apartmentRepo.findById(id);
    }

    @Override
    public void save(Apartment apartment) {
        apartmentRepo.save(apartment);
    }

    @Override
    public void remove(Long id) {
        apartmentRepo.deleteById(id);
    }
}
