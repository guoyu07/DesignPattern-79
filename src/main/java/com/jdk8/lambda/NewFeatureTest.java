package com.jdk8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyimeng on 2016/12/20.
 */
public class NewFeatureTest {

    public static void main(String[] args) {

        NewFeatureTest test = new NewFeatureTest();

        /**
         * 带有类型声明的表达式
         */
        MathOperation addtion = (int a, int b) -> a + b;

        /**
         * 没有类型声明的表达式
         */
        MathOperation subtraction = (a, b) -> a - b;

        /**
         * 带有大括号，返回语句的表达式
         */
        MathOperation multiplication = (a,b) -> { return a * b; };

        /**
         * 没有大括号，返回语句的表达式
         */
        MathOperation division = (a, b) -> a / b;

        /**
         * 输出结果
         */
        System.out.println("10 + 5 = " + test.operate(10,5,addtion));
        System.out.println("10 - 5 = " + test.operate(10,5,subtraction));
        System.out.println("10 * 5 = " + test.operate(10,5,multiplication));
        System.out.println("10 / 5 = " + test.operate(10,5,division));

        GreetingService greetingService1 = message -> System.out.println("Hello, " + message);
        greetingService1.sayMessage("ludi");

        GreetingService greetingService2 = (message) -> System.out.println("Hello oh haha " + message);
        greetingService2.sayMessage("lululululu");

        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zeck");
        names.add("Bob");

        names.forEach(System.out::println);

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }


    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
