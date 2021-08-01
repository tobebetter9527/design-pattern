package com.freedom.pattern.proxy.proxy.v5;

/**
 * Bird类实现接口Flyable，鸟能飞 。
 * <p>问题1：我想统计一下fly()运行多久,简单的方法是修改源码</p>
 * <p>问题2：如果不能修改源码呢，又怎么办。办法是继承。</p>
 * <p>问题3：如果我再想打印日志，怎么办，再来一个类. 虽然能解决问题，但是如果我想做权限拦截，又要再生成一个类，如果
 * 我想既实现日志打印，又想统计时间，又要再生成一个类，这样类越来越多，维护和扩展及其糟糕</p>
 * <p>问题3的解决办法是代理,直接持有Bird实例，这个虽然能解决类爆炸问题，但是没有功能组合问题</p>
 *
 * @author tobebetter9527
 * @create 2021/07/31 19:47
 */
public class Main {

  public static void main(String[] args) {
    Bird bird = new Bird();
    BirdTime birdTime = new BirdTime(bird);
    birdTime.fly();
    BirdLog birdLog = new BirdLog(bird);
    birdLog.fly();
  }
}

class BirdLog implements Flyable {

  private Bird bird;

  public BirdLog(Bird bird) {
    this.bird = bird;
  }

  @Override
  public void fly() {
    System.out.println("开始打印日志");
    bird.fly();
    System.out.println("结束打印日志");
  }
}

class BirdTime implements Flyable {

  private Bird bird;

  public BirdTime(Bird bird) {
    this.bird = bird;
  }

  @Override
  public void fly() {
    long start = System.currentTimeMillis();
    bird.fly();
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