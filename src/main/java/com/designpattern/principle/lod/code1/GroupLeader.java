package com.designpattern.principle.lod.code1;

import java.util.List;

/**
 * Created by liyimeng on 2016/12/3.
 */
public class GroupLeader {
    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }
    public void countGirls() {
        System.out.println("女生数量是:" + listGirls.size());
    }
}
