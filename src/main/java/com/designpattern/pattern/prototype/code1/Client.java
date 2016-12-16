package com.designpattern.pattern.prototype.code1;

import java.util.Random;

/**
 * 问题：单线程运行，如果数据量增大，运行时间过长，数据也不一定会准确。
 * 如果把 sendMail 方法改为多线程运行，则会产生竞争资源，线程不安全。
 * Created by liyimeng on 2016/12/16.
 */
public class Client {
    private static int MAX_COUNT = 100;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            mail.setAppellation(getRandString(5) + "先生/女士");
            mail.setReciver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
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
