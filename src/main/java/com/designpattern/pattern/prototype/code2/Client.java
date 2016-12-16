package com.designpattern.pattern.prototype.code2;

import com.designpattern.pattern.prototype.code1.AdvTemplate;

import java.util.Random;

/**
 * 通过对象复制，而不是 new 关键字来产生一个对象
 * 这种模式称为原型模式。
 * Created by liyimeng on 2016/12/16.
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + "先生/女士");
            cloneMail.setReciver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReciver() + "\t.....发送成功！");
    }

    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0;i<maxLength;i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
