package com.jdk8.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by liyimeng on 2016/12/20.
 */
public class Client2 {

    public static void main(String[] args) {

        System.out.println("Using in Java 7 :");
        //统计""字符串数量
        List<String> strings = Arrays.asList("efg", "", "abc", "bc", "ghij", "", "lmn");
        System.out.println("List : " + strings);
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("Empty String Count : " + count);
        //长度大于3的字符串数量
        count = getCountLength3UsingJava7(strings);
        System.out.println("String of length 3 : " + count);
        //去除空串。
        List<String> newList = deleteEmptyStringUsingJava7(strings);
        System.out.println("Filted String : " + newList);
        //去除空串，同时用逗号连接，获取一整个字符串
        String mergedString = getMergedString(strings);
        System.out.println("Merged String : " + mergedString);


        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("Integer List : " + integers);
        System.out.println("Max number of List : " + getMax(integers));
        System.out.println("Min number of List : " + getMin(integers));
        System.out.println("Sum of List : " + getSum(integers));
        System.out.println("Average of List : " + getAverage(integers));

        //输出10个随机数
        System.out.println("Random Numbers: ");
        Random random = new Random();
        for(int i=0; i<10 ;i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("Using Java 8 : ");
        count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty String : " + count);
        count = strings.stream().filter(string -> string.length() >= 3).count();
        System.out.println("Length >= 3 : " + count);
        newList = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("newList : " + newList);
        mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("mergedString : " + mergedString);


        IntSummaryStatistics statistics = integers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("max : " + statistics.getMax());
        System.out.println("min : " + statistics.getMin());
        System.out.println("sum : " + statistics.getSum());
        System.out.println("average : " + statistics.getAverage());
        random.ints().limit(10).forEach(System.out::println);
    }

    private static int getAverage(List<Integer> integers) {
        int averge = 0;
        int size = integers.size() > 0 ? integers.size() : 1;
        for (Integer integer : integers) {
            averge += integer;
        }
        return averge / size;
    }

    private static int getSum(List<Integer> integers) {
        int count = 0;
        for (Integer integer : integers) {
            count += integer;
        }
        return count;
    }

    private static int getMin(List<Integer> integers) {
        int min = 100;
        for (Integer integer : integers) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }

    private static int getMax(List<Integer> integers) {
        int max = 0;
        for (Integer integer : integers) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    private static String getMergedString(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            if (!string.isEmpty()) {
                sb.append(string);
                sb.append(",");
            }
        }
        String str = sb.toString();
        String substring = str.substring(0, str.lastIndexOf(","));
        return substring;
    }

    private static List<String> deleteEmptyStringUsingJava7(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            if (!string.isEmpty()) {
                list.add(string);
            }
        }
        return list;
    }

    private static long getCountLength3UsingJava7(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.length() >= 3) {
                count++;
            }
        }
        return count;
    }

    private static long getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

}
