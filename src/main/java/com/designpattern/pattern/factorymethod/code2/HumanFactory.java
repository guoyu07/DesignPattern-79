package com.designpattern.pattern.factorymethod.code2;

import com.designpattern.pattern.factorymethod.code1.Human;

/**
 * Created by liyimeng on 2016/12/9.
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();

        } catch (Exception e) {
            System.out.println("人种生成错误!");
        }
        return (T) human;
    }
}
