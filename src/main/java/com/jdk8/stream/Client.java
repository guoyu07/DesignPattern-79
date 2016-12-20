package com.jdk8.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by liyimeng on 2016/12/20.
 */
public class Client {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2, 3, 3, 2, 5, 2, 7);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);

        List<String> strings = Arrays.asList("efg", "", "", "abc", "bc", "ghij", "", "lmn");
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

        random.ints().limit(10).sorted().forEach(System.out::println);

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List:" + filtered);
        String mergedString = strings.stream().filter(a -> !a.isEmpty()).collect(Collectors.joining(","));
        System.out.println("Merged String:" + mergedString);

        IntSummaryStatistics statistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + statistics.getMax());
        System.out.println("Lowest number in List : " + statistics.getMin());
        System.out.println("Sum of all numbers : " + statistics.getSum());
        System.out.println("Average of all numbers : " + statistics.getAverage());
        System.out.println(statistics);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);
        LocalDate date1 = localDateTime.toLocalDate();
        System.out.println("date1 : " + date1);
        System.out.println("month : " + localDateTime.getMonth());
        System.out.println("month : " + localDateTime.getDayOfMonth());
    }


}
