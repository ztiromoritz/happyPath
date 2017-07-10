package de.mo.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamOptional {


    public static void main(String[] args){

        final List<Integer> listA = Stream.of(1, 2, 3, 4, 5)
                .map(x -> x * x)
                .map(x -> x - 3)
                .filter(x -> x > 2)
                .collect(Collectors.toList());
        System.out.println(listA);

        final List<Integer> listB = Arrays.asList(10, 20, 30, 40, 50);

        for (Integer x: listA) {
            for(Integer y: listB){

            }
        }


        final Optional<Integer> valueA = Optional.of(2)
                .map(x -> x * x)
                .map(x -> x - 3)
                .filter(x -> x > 2);

        final Optional<Integer> valueB = Optional.of(3)
                .map(x -> x * x)
                .map(x -> x - 3)
                .filter(x -> x > 2);

        final Optional<Integer> valueC = Optional.<Integer>empty()
                .map(x -> x * x)
                .map(x -> x - 3)
                .filter(x -> x > 2);


        Integer sum = null;
        if(valueA.isPresent()){
            if(valueB.isPresent()){
                sum = valueA.get() + valueB.get();
            }
        }
        System.out.println(sum);


        //Java9 to Stream

    }
}
