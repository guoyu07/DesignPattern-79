package com.designpattern.principle.lod.code2;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class InstallSoftWare {

    /**
     * wizard类中的太多的方法暴露给力InstallSoftWare类,两者耦合度过高.
     * @param wizard
     */
    public void installWizard(Wizard wizard) {
        int first = wizard.first();
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();
                if (third > 50) {
                    System.out.println("安装成功...");
                }
            }
        }
    }

}
