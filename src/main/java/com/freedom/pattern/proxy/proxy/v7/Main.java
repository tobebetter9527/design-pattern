package com.freedom.pattern.proxy.proxy.v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Bird类实现接口Flyable，鸟能飞 。
 * <p>问题1：我想统计一下fly()运行多久,简单的方法是修改源码</p>
 * <p>问题2：如果不能修改源码呢，又怎么办。办法是继承。</p>
 * <p>问题3：如果我再想打印日志，怎么办，再来一个类. 虽然能解决问题，但是如果我想做权限拦截，又要再生成一个类，如果
 * 我想既实现日志打印，又想统计时间，又要再生成一个类，这样类越来越多，维护和扩展及其糟糕</p>
 * <p>问题3的解决办法是代理,直接持有Bird实例，这个虽然能解决类爆炸问题，但是没有功能组合问题,解决方法是用接口替换</p>
 * <p>问题4：如果有很多方法需要打印方法前后日志怎么办，办法：动态代理</p>
 *
 * @author tobebetter9527
 * @create 2021/07/31 19:47
 */
public class Main {

  public static void main(String[] args) {
    Bird bird = new Bird();
    Flyable instance = (Flyable) Proxy
        .newProxyInstance(Bird.class.getClassLoader(), new Class[]{Flyable.class}, new BirdLog(bird));
    instance.fly();
  }
}


class BirdLog implements InvocationHandler {

  private Flyable bird;

  public BirdLog(Flyable bird) {
    this.bird = bird;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("开始打印日志");
    Object invoke = method.invoke(bird, args);
    System.out.println("结束打印日志");
    return invoke;
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