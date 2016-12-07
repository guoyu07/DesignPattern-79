package com.designpattern.principle.lod.code3;

import java.util.Random;

/**
 * 将不必暴露的方法设置为私有.
 * Created by liyimeng on 2016/12/7.
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());



    private int first() {
        System.out.println("执行第一步.....");
        return rand.nextInt(100);
    }

    private int second() {
        System.out.println("执行第二步.....");
        return rand.nextInt(100);
    }

    private int third() {
        System.out.println("执行第三步.....");
        return rand.nextInt(100);
    }

    public void installWizard() {
        int first = this.first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    System.out.println("安装成功...");
                }
            }
        }
    }
}
