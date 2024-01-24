package com.example.demo.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Fraction {
    private int nominator;
    private int denominator;
}
