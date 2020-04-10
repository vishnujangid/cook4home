package com.cook4home.service;

import com.cook4home.mapper.CookMapper;
import com.cook4home.model.Cook;
import com.cook4home.reposiotory.CookReposotory;
import com.cook4home.response.CookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CookService {

    final CookReposotory cookReposotory;
    final CookMapper cookMapper;

    public List<CookResponse> getAllCooks() {
        return cookReposotory.findAll().stream().map(cookMapper::mapCookToCookResponse).collect(Collectors.toList());
    }
}
