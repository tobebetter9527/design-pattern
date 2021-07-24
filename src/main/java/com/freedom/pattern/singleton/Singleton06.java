package com.freedom.pattern.singleton;

/**
 * 懒汉式，实现了按需加载，获得实例对象的操作不都是串行化，
 * 提升性能，volatile保证变量可见性。比较理想的写法。
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton06 {

  private static volatile Singleton06 INSTANCE;

  private Singleton06() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  public static Singleton06 getInstance() {
    // 双重检查
    if (INSTANCE == null) {
      synchronized (Singleton06.class) {
        if (INSTANCE == null) {
          // 模拟创建对象比较慢
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          INSTANCE = new Singleton06();
        }
      }
    }
    return INSTANCE;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(Singleton06.getInstance().hashCode())).start();
    }
  }

}
