package com.designpattern.pattern.templatemethod.code2;

/**
 * Created by liyimeng on 2016/12/13.
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("h2 start.....");
    }

    @Override
    protected void stop() {
        System.out.println("h2 stop.....");
    }

    @Override
    protected void alarm() {
        System.out.println("h2 alarm......");
    }

    @Override
    protected void engineBoom() {
        System.out.println("h2 engineBoom....");
    }

    /**
     * 默认不鸣笛。
     * @return
     */
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
