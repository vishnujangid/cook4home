package com.cook4home.mapper;
    
    import com.cook4home.model.Cook;
    import com.cook4home.response.CookResponse;
    import org.dozer.DozerBeanMapper;
    import org.springframework.stereotype.Component;

/**
 * Created by Vishnu.jangid on 09/04/2020 AD .
 */
@Component
public class CookMapper extends AbstractMapper {
    
    public CookMapper(DozerBeanMapper dozerBeanMapper) {
        super(dozerBeanMapper);
    }
    
    public CookResponse mapCookToCookResponse(Cook cook) {
        return mapper.map(cook, CookResponse.class);
    }
    
    public Cook mapCookResponseToCook(CookResponse cookResponse) {
        return mapper.map(cookResponse, Cook.class);
    }
    
}
