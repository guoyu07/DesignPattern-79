package com.designpattern.pattern.builder;

import java.util.List;

/**
 * Created by liyimeng on 2016/12/14.
 */
public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
