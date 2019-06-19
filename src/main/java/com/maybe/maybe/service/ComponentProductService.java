package com.maybe.maybe.service;

import com.maybe.maybe.repository.ComponentProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ComponentProductService {
    private ComponentProductRepository componentProductRepository;

    public ComponentProductService(ComponentProductRepository componentProductRepository) {
        this.componentProductRepository = componentProductRepository;
    }

    public double getExponentialValue(int base, int exponent){

        double result;
        if (exponent < 0){
            result = 1 / calculation(base, -exponent);
        } else{
            result = calculation(base, exponent);
        }
        return result;
    }

    private double calculation(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * getExponentialValue(base, exponent - 1);
    }
}
//ghjghjghjgjghjasfdsdfsdf