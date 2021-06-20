package com.freedom.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 17:17
 */
public class Product {
    // 模拟产品部件
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
