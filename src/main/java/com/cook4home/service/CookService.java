package com.cook4home.service;

import com.cook4home.model.Cook;
import com.cook4home.reposiotory.CookReposotory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CookService {

    final CookReposotory cookReposotory;

    public List<Cook> getAllCooks() {
        return cookReposotory.findAll();
    }
}
