package com.designpattern.pattern.templatemethod.code1;

/**
 * 悍马模型
 * protected 关键字，标识了该方法需要被重写。已完成不同的逻辑。
 * final 关键字，保护方法不会被篡改。
 * Created by liyimeng on 2016/12/12.
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
     * 引擎轰鸣
     */
    protected abstract void engineBoom();

    /**
     * 运行
     */
    final void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
