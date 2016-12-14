package com.designpattern.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyimeng on 2016/12/13.
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for(int i=0;i<this.sequence.size();i++) {
            String actionName = sequence.get(i);
            switch (actionName) {
                case "start" :      this.start();break;
                case "stop"  :      this.stop();break;
                case "alarm" :      this.alarm();break;
                case "engineBoom" : this.engineBoom();break;
                default:break;
            }

        }
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
