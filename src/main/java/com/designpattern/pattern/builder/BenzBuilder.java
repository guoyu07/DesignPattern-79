package com.designpattern.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyimeng on 2016/12/14.
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel;

    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel = new BenzModel();
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
