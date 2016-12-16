package com.designpattern.pattern.prototype.code3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by liyimeng on 2016/12/16.
 */
public class ClassA implements Cloneable{

    private ArrayList<String> arrayList = new ArrayList<>();

    private int age;


    public ClassA() {
        System.out.println("构造方法执行。。。。");
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected ClassA clone() {
        ClassA classA = null;
        try {
            classA = (ClassA) super.clone();
            this.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return classA;
    }
}
