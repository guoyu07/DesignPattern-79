package com.designpattern.pattern.templatemethod.code2;

/**
 * Created by liyimeng on 2016/12/13.
 */
public class HummerH1Model extends HummerModel{

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("h1 start......");
    }

    @Override
    protected void stop() {
        System.out.println("h1 stop......");
    }

    @Override
    protected void alarm() {
        System.out.println("h1 alarm.....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("h1 engineBoom.....");
    }

    /**
     * 重写钩子方法。
     * @return
     */
    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    /**
     * 根据需求，设置要不要鸣笛。
     * @param alarmFlag
     */
    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
