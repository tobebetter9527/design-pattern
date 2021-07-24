package com.freedom.pattern.singleton;

/**
 * 饿汉式，跟Singleton01一样
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton02 {

  private static Singleton02 INSTANCE;

  static {
    INSTANCE = new Singleton02();
  }

  private Singleton02() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  public static Singleton02 getInstance() {
    return INSTANCE;
  }

  public static void main(String[] args) {
    Singleton02 instance = Singleton02.getInstance();
    instance.doSomething();

    Singleton02 instance2 = Singleton02.getInstance();
    System.out.println(instance == instance2);
  }

}
