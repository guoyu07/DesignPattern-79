package com.designpattern.principle.lsp.code;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * Created by liyimeng on 2016/12/3.
 */
public class Son extends Father {

    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行了....");
        return map.values();
    }
}
