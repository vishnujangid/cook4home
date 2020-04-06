package com.cook4home.controller;

import com.cook4home.model.Cook;
import com.cook4home.service.CookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CookController {

    final CookService cookService;

    @GetMapping(value = "/cooks")
    public ResponseEntity<?> getAllCooks() {
        List<Cook> cookList = cookService.getAllCooks();
        return new ResponseEntity<>(cookList, HttpStatus.FOUND);
    }

}
