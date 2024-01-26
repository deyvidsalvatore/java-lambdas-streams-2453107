package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        List<String> sortedShoppingList = shoppingList.stream()
                .sorted()
                .map(String::toUpperCase)
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(sortedShoppingList);
        System.out.println(shoppingList);


        // stream has already been operated upon or closed
        //shoppingListStream.forEach(System.out::println);

    }
}
