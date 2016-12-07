package com.designpattern.principle.lod.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyimeng on 2016/12/3.
 */
public class Client {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        List<Girl> listGirls = new ArrayList<>();
        for(int i=0;i<20;i++) {
            listGirls.add(new Girl());
        }
        teacher.commond(new GroupLeader(listGirls));
    }

}
