package com.freedom.pattern.proxy.proxy.v2;

/**
 * Bird类实现接口Flyable，鸟能飞 。
 * <p>问题1：我想统计一下fly()运行多久,简单的方法是修改源码</p>
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
    long start = System.currentTimeMillis();

    System.out.println("I can fly...");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long end = System.currentTimeMillis();
    System.out.println("Run time is " + (end - start));
  }
}

interface Flyable {

  void fly();
}