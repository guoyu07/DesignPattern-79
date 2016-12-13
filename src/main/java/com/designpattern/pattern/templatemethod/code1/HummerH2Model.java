package com.designpattern.pattern.templatemethod.code1;

/**
 * Created by liyimeng on 2016/12/12.
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h2 start...");
    }

    @Override
    public void stop() {
        System.out.println("h2 stop....");
    }

    @Override
    public void alarm() {
        System.out.println("h2 alarm...");
    }

    @Override
    public void engineBoom() {
        System.out.println("h2 enginBoom...");
    }

}
