package com.timeo.FacteursPremiers;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers
{
    public static String test()
    {
        return "haya";
    }

    public static List<Integer> generate(int n)
    {
        List<Integer> facteursPremiers = new ArrayList<>();

        if (n < 2) {
            return facteursPremiers; // retourne une liste vide si n < 2
        }

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                facteursPremiers.add(i);
                n /= i;
            }
        }

        return facteursPremiers;

    }
}
