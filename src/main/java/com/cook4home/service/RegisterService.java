package com.cook4home.service;

import com.cook4home.mapper.RegiesterMapper;
import com.cook4home.model.Register;
import com.cook4home.pojo.Login;
import com.cook4home.reposiotory.RegisterRepository;
import com.cook4home.request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class RegisterService {
    
    final RegisterRepository registerRepository;
    final RegiesterMapper regiesterMapper;
    
    
    public Boolean registerCook(RegisterRequest registerRequest) {
        Register register = regiesterMapper.mapRegisterRequestToRegister(registerRequest);
        registerRepository.save(register);
        return true;
    }
    
    public Register checkLogin(Login login) {
        return registerRepository.findByEmail(login.getEmail());
    }
}
