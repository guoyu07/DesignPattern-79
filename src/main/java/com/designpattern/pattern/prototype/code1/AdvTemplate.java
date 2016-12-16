package com.designpattern.pattern.prototype.code1;

/**
 * 广告模板
 * Created by liyimeng on 2016/12/16.
 */
public class AdvTemplate {
    //广告标题
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    //广告内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送一百万。。。";

    //获取广告标题
    public String getAdvSubject() {
        return this.advSubject;
    }
    //获取广告内容
    public String getAdvContext() {
        return this.advContext;
    }
}
