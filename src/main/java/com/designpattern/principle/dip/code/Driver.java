package com.designpattern.principle.dip.code;

/**
 * Created by liyimeng on 2016/12/3.
 */
public class Driver implements IDriver {

    public void drive(ICar car) {
        car.run();
    }
}
