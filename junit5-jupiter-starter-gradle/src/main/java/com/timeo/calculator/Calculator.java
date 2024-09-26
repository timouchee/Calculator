package com.timeo.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {


    public static int add(int opG, int opD)
    {
       return opG+opD;
    }

    public static int divide(int opG, int opD)
    {
        return  opG/opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre)
    {
        // Créer un ensemble pour stocker les chiffres uniques
        Set<Integer> chiffresUniques = new HashSet<>();

        // Si le nombre est négatif, le rendre positif
        pNombre = Math.abs(pNombre);

        // Tant que le nombre n'est pas 0
        while (pNombre > 0) {
            // Obtenir le dernier chiffre du nombre
            int chiffre = pNombre % 10;
            // Ajouter le chiffre à l'ensemble
            chiffresUniques.add(chiffre);
            // Supprimer le dernier chiffre du nombre
            pNombre /= 10;
        }

        return chiffresUniques;
    }
}
