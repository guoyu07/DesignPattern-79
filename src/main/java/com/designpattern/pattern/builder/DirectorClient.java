package com.designpattern.pattern.builder;

/**
 * Created by liyimeng on 2016/12/14.
 */
public class DirectorClient {
    public static void main(String[] args) {

        Director director = new Director();
        for (int i = 0 ;i<5;i++) {
            CarModel carModel = director.getABenzModel();
            System.out.println(carModel);
            carModel.run();
        }
        for (int i = 0 ;i<5;i++) {
            CarModel carModel = director.getBBenzModel();
            System.out.println(carModel);
            carModel.run();
        }

        for (int i = 0 ;i<5;i++) {
            CarModel carModel = director.getCBMWModel();
            System.out.println(carModel);
            carModel.run();
        }

        for (int i = 0 ;i<5;i++) {
            CarModel carModel = director.getDBMWModel();
            System.out.println(carModel);
            carModel.run();
        }

    }
}
