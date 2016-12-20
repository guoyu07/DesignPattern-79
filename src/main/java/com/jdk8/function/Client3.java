package com.jdk8.function;

import java.util.Optional;

/**
 * Created by liyimeng on 2016/12/20.
 */
public class Client3 {

    public static void main(String[] args) {
        Client3 client3 = new Client3();

        Integer value1 = null;
//        Integer value2 = new Integer(5);
        Integer value2 = new Integer(5);
        //ofNullable 允许为null
        Optional<Integer> a = Optional.ofNullable(value1);
        //of 不允许为null 会抛出 NullPointException 异常
        Optional<Integer> b = Optional.of(value2);

        System.out.println(client3.sum(a, b));

    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("a parameter is present:" + a.isPresent());
        System.out.println("b paramster is present:" + b.isPresent());

        //不存在，默认值。
        Integer value1 = a.orElse(new Integer(2));

        Integer value2 = b.get();

        return value1 + value2;
    }
}
