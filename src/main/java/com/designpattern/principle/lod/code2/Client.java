package com.designpattern.principle.lod.code2;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class Client {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        InstallSoftWare installSoftWare = new InstallSoftWare();
        installSoftWare.installWizard(wizard);
    }
}
