package com.designpattern.principle.ocp.code2;

import com.designpattern.principle.ocp.code1.NovelBook;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String _name, String _author, int _price) {
        super(_name, _author, _price);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPirce = 0;
        if (selfPrice > 4000) {
            offPirce = selfPrice * 90 / 100;
        } else {
            offPirce = selfPrice * 80 / 100;
        }
        return offPirce;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "name='" + super.getName() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", price=¥" + this.getPrice() / 100.0 +
                '}';
    }
}
