package com.jdk8.function;

/**
 * Created by liyimeng on 2016/12/20.
 */
public class Client2 {
    public static void main(String[] args) {
        Younger younger = new Student();
        younger.print();
    }

    interface Younger {
        default void print() {
            System.out.println("I am a Younger.");
        }

        static void sayHi() {
            System.out.println("Young is the capital.");
        }
    }

    interface Learner {
        default void print() {
            System.out.println("I am a Learner.");
        }
    }

    static class Student implements Younger, Learner {

        public void print() {
            Younger.super.print();
            Learner.super.print();
            Younger.sayHi();
            System.out.println("I am a Student.");
        }
    }
}
