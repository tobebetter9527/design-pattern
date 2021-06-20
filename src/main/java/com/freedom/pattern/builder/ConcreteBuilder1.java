package com.freedom.pattern.builder;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 17:35
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildA() {
        product.add("part A");
    }

    @Override
    public void buildB() {
        product.add("part B");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
