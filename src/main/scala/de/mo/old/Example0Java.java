package de.mo.old;

import de.mo.Pokemon;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rebbert on 07.07.17.
 */
@SuppressWarnings("ALL")
public class Example0Java {


    public static void main(String[] args) {

        final Function<String, String> evolve = Pokemon::evolve;

        final Function<String, Function<String, String>> megaStone = (modify) -> {
            return (String pokemon) -> {
                return Pokemon.megaStone(modify, pokemon);
            };
        };

        //-------------------------------------------------

        final Optional<String> evolvedPokemon =
                Optional.of("Glurak")
                        .map(evolve)
                        .map(evolve);


        //-------------------------------------------------
        System.out.println(evolvedPokemon);
    }
}
