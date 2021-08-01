package com.freedom.pattern.proxy.proxy.v1;

/**
 * Bird类实现接口Flyable，鸟能飞 。
 * <p>问题1：我想统计一下fly()运行多久</p>
 *
 * @author tobebetter9527
 * @create 2021/07/31 19:47
 */
public class Main {

  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.fly();
  }
}

class Bird implements Flyable {

  @Override
  public void fly() {
    System.out.println("I can fly...");
  }
}

interface Flyable {

  void fly();
}