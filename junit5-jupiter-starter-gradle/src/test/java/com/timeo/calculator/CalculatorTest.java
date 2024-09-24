package com.timeo.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup ()
    {
        calculator = new Calculator();
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



    @AfterEach
    void enUp()
    {

    }

}