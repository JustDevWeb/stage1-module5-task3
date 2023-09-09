package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter( x -> x % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
      return   list.stream().map( x -> x.toUpperCase() ).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max((a , b) -> a.compareTo(b) );
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap( value -> value.stream()).min(( a,b )-> a.compareTo( b ));
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,( a, b ) -> a + b);
    }
}
