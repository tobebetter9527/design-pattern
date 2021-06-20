package com.freedom.pattern.builder;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 17:49
 */
public class Client {
    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();
        Director director = new Director();
        director.construct(builder1);

        Product product = builder1.getProduct();
        product.show();
    }
}
