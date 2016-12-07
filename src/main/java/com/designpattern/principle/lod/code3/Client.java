package com.designpattern.principle.lod.code3;

import com.designpattern.principle.lod.code3.InstallSoftWare;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class Client {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        InstallSoftWare installSoftWare = new InstallSoftWare();
        installSoftWare.install(wizard);

    }
}
