package com.freedom.pattern.prototype;

import javax.swing.text.DefaultHighlighter;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/05 23:05
 */
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("执行构造函数");
    }

    @Override
    protected Thing clone() throws CloneNotSupportedException {
        return (Thing) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Thing thing = new Thing();
        Thing clone = thing.clone();
    }
}
