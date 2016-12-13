package com.designpattern.pattern.templatemethod.code2;

/**
 * Created by liyimeng on 2016/12/13.
 */
public abstract class HummerModel {
    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 发动机轰鸣
     */
    protected abstract void engineBoom();

    /**
     * 出发
     */
    final void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     * 是否鸣笛，默认可以，钩子方法，适应需求变化。
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }
}
