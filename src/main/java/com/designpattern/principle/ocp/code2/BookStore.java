package com.designpattern.principle.ocp.code2;

import com.designpattern.principle.ocp.code1.IBook;
import com.designpattern.principle.ocp.code1.NovelBook;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by liyimeng on 2016/12/7.
 */
public class BookStore {
    public static final ArrayList<IBook> BOOKLIST = new ArrayList<>();
    static {
        BOOKLIST.add(new OffNovelBook("天龙八部", "金庸", 3200));
        BOOKLIST.add(new OffNovelBook("巴黎圣母院", "雨果", 5600));
        BOOKLIST.add(new OffNovelBook("悲惨世界", "雨果", 3500));
        BOOKLIST.add(new OffNovelBook("金瓶梅", "兰陵笑笑生", 4300));
    }

    public static void main(String[] args) {
        System.out.println("----------书店卖出去的书籍记录如下:----------");
        for (IBook iBook : BOOKLIST) {
            System.out.println(iBook);
        }
    }
}
