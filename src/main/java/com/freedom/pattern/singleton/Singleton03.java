package com.freedom.pattern.singleton;

/**
 * 懒汉式，实现了按需加载，但是线程不安全
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton03 {

  private static Singleton03 INSTANCE;

  private Singleton03() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  public static Singleton03 getInstance() {
    if (INSTANCE == null) {
      // 模拟创建对象比较慢
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      INSTANCE = new Singleton03();
    }
    return INSTANCE;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(Singleton03.getInstance().hashCode())).start();
    }
  }

}
