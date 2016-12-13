package com.designpattern.pattern.templatemethod.code1;

/**
 * Created by liyimeng on 2016/12/12.
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h1 start...");
    }

    @Override
    public void stop() {
        System.out.println("h1 stop....");
    }

    @Override
    public void alarm() {
        System.out.println("h1 alarm...");
    }

    @Override
    public void engineBoom() {
        System.out.println("h1 enginBoom...");
    }

}
