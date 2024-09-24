package com.timeo.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;  // Import nécessaire pour utiliser HashSet
import java.util.Collections;  // Import pour addAll
import java.util.Set;  // Import de l'interface Set


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup ()
    {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",  // opG = 0, opD = 1, res = 1
            "1, 2, 3",  // opG = 1, opD = 2, res = 3
            "-2, 2, 0", // opG = -2, opD = 2, res = 0
            "0, 0, 0",  // opG = 0, opD = 0, res = 0
            "-1, -2, -3"// opG = -1, opD = -2, res = -3
    })
    void devrait_faire_des_add_en_list(int opG, int opD, int res) {
        assertEquals(res, Calculator.add(opG, opD));
    }

    @Test
    void devrait_faire_laddition_2_et_5()
    {
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    void devrait_diviser_10_par_2()
    {
        assertEquals(5,calculator.divide(10,2));
    }

    @Test
    void devrait_separer_1145()
    {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 1, 4, 5);
        assertEquals(set,Calculator.ensembleChiffres(1145));
    }

    @AfterEach
    void enUp()
    {

    }

}