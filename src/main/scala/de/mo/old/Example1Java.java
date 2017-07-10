package de.mo.old;

import de.mo.Pokemon;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rebbert on 07.07.17.
 */
@SuppressWarnings("ALL")
public class Example1Java {


    public static void main(String[] args) {

        final Function<String, String> evolve = Pokemon::evolve;

        final Function<String, Function<String, String>> megaStone = (modify) -> {
            return (String pokemon) -> {
                return Pokemon.megaStone(modify, pokemon);
            };
        };

        //-------------------------------------------------

        final List<String> evolvedPokemon =
                Stream.of("Bisasam", "Glumanda", "Pikachu")
                        .map(evolve)
                        .map(evolve)
                        .collect(Collectors.toList());


        //-------------------------------------------------
        System.out.println(evolvedPokemon);
    }
}
