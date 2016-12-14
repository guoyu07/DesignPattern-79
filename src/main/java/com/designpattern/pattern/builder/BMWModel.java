package com.designpattern.pattern.builder;

import com.designpattern.principle.dip.code.BMW;

/**
 * Created by liyimeng on 2016/12/13.
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("BMW start.....");
    }

    @Override
    protected void stop() {
        System.out.println("BMW stop.....");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW alarm.....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW engineBoom");
    }
}
