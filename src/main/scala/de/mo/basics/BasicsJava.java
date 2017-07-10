package de.mo.basics;

import de.mo.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static de.mo.Pokemon.*;
import static java.util.Arrays.asList;

@SuppressWarnings("SpellCheckingInspection")
public class BasicsJava {

    public static void main(String[] args) {
    }


    public void simpleForLoop() {

        boolean fire = new Random().nextBoolean();


        for (String p : asList("Glumanda", "Bisasam", "Schiggy"))
            System.out.println(p);

        List<String> evolvedPokemon = new ArrayList<>();
        for (String p : asList("Glumanda", "Bisasam", "Schiggy")) {
            evolvedPokemon.add(p);
        }

        String starter = (fire) ? "Glumanda" : "Bisasam";

        System.out.println(evolvedPokemon);
    }


    public void forWithGuard() {

        List<String> evolvedFirePokemon = new ArrayList<>();
        for (String p : asList("Glumanda", "Bisasam")) {
            if (isFire(p)) {
                evolvedFirePokemon.add(p);
            }
        }

        System.out.println(evolvedFirePokemon);
    }

    static void createMatch(String a, String b) {
        //
    }

    public static void nestedLoop() {

        for (String p1 : asList("Glumanda", "Bisasam", "Schiggy")) {
            for (String p2 : asList("Pikachu", "Ottaro")) {
                createMatch(p1, p2);
            }
        }

    }


    public static void assignment() {

        for (String p1 : asList("Glumanda", "Bisasam", "Schiggy")) {
            for (String p2 : asList("Pikachu", "Ottaro")) {
                String evolved1 = evolve(p1);
                String evolved2 = evolve(p2);
                createMatch(evolved1, evolved2);
            }
        }

    }

    public static void combine() {

        for (String p1 : asList("Glumanda", "Bisasam", "Schiggy")) {
            for (String p2 : asList("Pikachu", "Ottaro")) {
                if (isFire(p2)) {
                    String evolved1 = evolve(p1);
                    String evolved2 = evolve(p2);
                    createMatch(evolved1, evolved2);
                }
            }
        }

    }


}