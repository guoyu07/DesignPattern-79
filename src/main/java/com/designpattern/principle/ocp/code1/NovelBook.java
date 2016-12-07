package com.designpattern.principle.ocp.code1;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class NovelBook implements IBook {

    private String name;    //书名
    private String author;  //作者
    private int price;      //价格

    public NovelBook(String _name, String _author, int _price) {
        this.name = _name;
        this.author = _author;
        this.price = _price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=¥" + price / 100.0 +
                '}';
    }
}
