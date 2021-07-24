package com.freedom.pattern.singleton;

/**
 * 内部静态类方式，JVM保证单例。加载外部类时不加载器静态内部类
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton07 {

  private Singleton07() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  private static class InnerHolder{
    private static final Singleton07 INSTANCE = new Singleton07();
  }

  public static Singleton07 getInstance() {

    return InnerHolder.INSTANCE;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(Singleton07.getInstance().hashCode())).start();
    }
  }

}
