package com.freedom.pattern.proxy.proxy.v3;

/**
 * Bird类实现接口Flyable，鸟能飞 。
 * <p>问题1：我想统计一下fly()运行多久,简单的方法是修改源码</p>
 * <p>问题2：如果不能修改源码呢，又怎么办。办法是继承。</p>
 *
 * @author tobebetter9527
 * @create 2021/07/31 19:47
 */
public class Main {

  public static void main(String[] args) {
    BirdTime bird = new BirdTime();
    bird.fly();
  }
}

class BirdTime extends Bird {

  @Override
  public void fly() {
    long start = System.currentTimeMillis();

    super.fly();

    long end = System.currentTimeMillis();
    System.out.println("Run time is " + (end - start));
  }
}

class Bird implements Flyable {

  @Override
  public void fly() {
    System.out.println("I can fly...");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

interface Flyable {

  void fly();
}