package com.cook4home.mapper;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

/**
 * Created by Vishnu.jangid on 09/04/2020 AD .
 */

@Component
public class AbstractMapper {
    protected final DozerBeanMapper mapper;
    
    public AbstractMapper(final DozerBeanMapper mapper) {
        this.mapper = mapper;
    }
}
