package com.designpattern.principle.ocp.code1;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class BookStore {

    public static final ArrayList<IBook> BOOKLIST = new ArrayList<>();
    static {
        BOOKLIST.add(new NovelBook("天龙八部", "金庸", 3200));
        BOOKLIST.add(new NovelBook("巴黎圣母院", "雨果", 3200));
        BOOKLIST.add(new NovelBook("悲惨世界", "雨果", 3200));
        BOOKLIST.add(new NovelBook("金瓶梅", "兰陵笑笑生", 3200));
    }

    public static void main(String[] args) {
        System.out.println("----------书店卖出去的书籍记录如下:----------");
        for (IBook iBook : BOOKLIST) {
            System.out.println(iBook);
        }
    }
}
