package com.example.demoapi.service.home;

import com.example.demoapi.model.Home;
import com.example.demoapi.service.IGeneralService;

import java.util.Optional;

public interface IHomeService extends IGeneralService<Home> {
    Optional<Home> findByName(String name);
}
