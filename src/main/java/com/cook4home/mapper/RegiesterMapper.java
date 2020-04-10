package com.cook4home.mapper;

import com.cook4home.model.Register;
import com.cook4home.request.RegisterRequest;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

/**
 * Created by Vishnu.jangid on 09/04/2020 AD .
 */
@Component
public class RegiesterMapper  extends AbstractMapper{
    
    public RegiesterMapper(DozerBeanMapper mapper) {
        super(mapper);
    }
    
    public Register mapRegisterRequestToRegister(RegisterRequest registerRequest){
        return mapper.map(registerRequest, Register.class);
    }
    public RegisterRequest mapRegisterToRegisterRequest(Register register){
        return mapper.map(register, RegisterRequest.class);
    }
}
