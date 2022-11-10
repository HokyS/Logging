package com.example.Logging.services;

import org.springframework.stereotype.Service;

@Service
public class EService {

    public double power(int base, int exponent) {
        if (base > 0 && exponent > 0) {
            return Math.pow(base, exponent);
        } else throw new Error("ERROR");
    }
}