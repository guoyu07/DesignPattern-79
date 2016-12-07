package com.designpattern.principle.lod.code3;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class InstallSoftWare {

    /**
     * 对比code2,Wizard类只暴露给了InstallSoftWare类一个方法,耦合性大大降低.
     * @param wizard
     */
    public void install(Wizard wizard) {
        wizard.installWizard();
    }

}
