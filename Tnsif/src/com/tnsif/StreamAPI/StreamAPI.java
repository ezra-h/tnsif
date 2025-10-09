package com.tnsif.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 10, 5, 30);
        System.out.println("Original List: " + numbers);
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println("Distinct Numbers: " + distinctNumbers);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
        List<Integer> doubled = numbers.stream()
                                       .map(n -> n * 2)
                                       .collect(Collectors.toList());
        System.out.println("Doubled Numbers: " + doubled);
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);
        List<Integer> firstFive = numbers.stream()
                                         .limit(5)
                                         .collect(Collectors.toList());
        System.out.println("First 5 Numbers: " + firstFive);
        long count = numbers.stream()
                            .filter(n -> n > 10)
                            .count();
        System.out.println("Count of numbers > 10: " + count);
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all numbers: " + sum);
        Set<Integer> numberSet = numbers.stream()
                                        .collect(Collectors.toSet());
        System.out.println("Collected as Set: " + numberSet);
        System.out.print("Numbers using forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
    }
}
