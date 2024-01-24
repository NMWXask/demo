package com.example.demo.controller;

import com.example.demo.entity.Fraction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    private final Fraction fraction;

    public Controller(Fraction fraction) {
        this.fraction = fraction;
    }

    public Fraction getFraction(){
        return new Fraction(10,5);
    }

    @GetMapping("/rest-example")
    public boolean checkFraction(){
        boolean rightFraction = false;

        if(getFraction().getNominator()> getFraction().getDenominator())
            rightFraction = true;
        return rightFraction;
    }
}
