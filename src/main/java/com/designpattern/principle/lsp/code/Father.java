package com.designpattern.principle.lsp.code;

import java.util.Collection;
import java.util.Map;

/**
 *
 * Created by liyimeng on 2016/12/3.
 */
public class Father {

    public Collection doSomething(Map map) {
        System.out.println("父类被执行了...");
        return map.values();
    }

}
