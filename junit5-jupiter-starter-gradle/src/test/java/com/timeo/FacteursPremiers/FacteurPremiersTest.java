package com.timeo.FacteursPremiers;

import com.timeo.calculator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;  // Import nécessaire pour utiliser HashSet
import java.util.Collections;  // Import pour addAll
import java.util.Set;  // Import de l'interface Set

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;



public class FacteurPremiersTest
{
    @Test
    public void tes()
    {
        //FacteursPremiers ho = new FacteursPremiers();
        //System.out.println(FacteursPremiers.test()) ;
    }

    @ParameterizedTest
    @CsvSource({
            "1, ''",        // Pour 1, on attend une liste vide
            "2, '2'",       // Pour 2, la liste attendue est [2]
            "6, '2, 3'",    // Pour 6, la liste attendue est [2, 3]
            "8, '2, 2, 2'", // Pour 8, la liste attendue est [2, 2, 2]
            "30, '2, 3, 5'" // Pour 30, la liste attendue est [2, 3, 5]
    })
    void devrait_generer_les_facteurs_premiers(int nombre, String facteursAttendus) {
        List<Integer> expected = facteursAttendus.isEmpty() ? List.of() : Arrays.asList(
                Arrays.stream(facteursAttendus.split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new)
        );
        //System.out.println(" test :  " + FacteursPremiers.generate(nombre)) ;
        assertEquals(expected, FacteursPremiers.generate(nombre));
    }


}
