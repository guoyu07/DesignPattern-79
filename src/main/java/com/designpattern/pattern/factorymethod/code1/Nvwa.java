package com.designpattern.pattern.factorymethod.code1;

/**
 * 女娲造人(Client)
 * Created by liyimeng on 2016/12/9.
 */
public class Nvwa {


    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();

        System.out.println("----------生产白色人种----------");
        Human white = factory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();
        System.out.println("----------生产黑色人种----------");
        Human black = factory.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();
        System.out.println("----------生产黄色人种----------");
        Human yellow = factory.createHuman(YellowHuman.class);
        yellow.getColor();
        yellow.talk();
    }

}
