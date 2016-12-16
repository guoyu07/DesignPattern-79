package com.designpattern.pattern.prototype.code1;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class Mail {
    //收件人
    private String reciver;

    //广告信标题
    private String subject;

    //称谓
    private String appellation;

    //邮件内容
    private String context;

    //邮件尾部
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
