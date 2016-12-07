package com.designpattern.principle.lod.code2;

import java.util.Random;

/**
 * Created by liyimeng on 2016/12/3.
 */
public class Wizard {

    private Random rand = new Random(System.currentTimeMillis());

    public int first() {
        System.out.println("执行第一步.....");
        return rand.nextInt(100);
    }

    public int second() {
        System.out.println("执行第二步.....");
        return rand.nextInt(100);
    }

    public int third() {
        System.out.println("执行第三步.....");
        return rand.nextInt(100);
    }
}
