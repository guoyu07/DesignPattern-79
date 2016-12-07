package com.designpattern.principle.lsp.code;

import java.util.HashMap;

/**
 *
 * Created by liyimeng on 2016/12/3.
 */
public class Client {

    public static void invoker() {
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }

}
