package com.designpattern.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyimeng on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        CarModel c1 = new BenzModel();
        CarModel c2 = new BMWModel();
        List<String> sequence1 = new ArrayList<>();
        List<String> sequence2 = new ArrayList<>();
        sequence1.add("start");
        sequence1.add("alarm");
        sequence1.add("engineBoom");
        sequence1.add("stop");

        sequence2.add("start");
        sequence2.add("engineBoom");
        sequence2.add("alarm");
        sequence2.add("stop");

        c1.setSequence(sequence1);
        c2.setSequence(sequence2);

        c1.run();
        c2.run();


    }
}
