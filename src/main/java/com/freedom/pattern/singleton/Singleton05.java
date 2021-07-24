package com.freedom.pattern.singleton;

/**
 * 懒汉式，实现了按需加载，获得实例对象的操作不都是串行化，
 * 提升性能，但是线程不安全，编译优化有可能让还未初始化的INSTANCE返回，
 * 其他线程因此拿到实例调用报空指针异常
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton05 {

  private static Singleton05 INSTANCE;

  private Singleton05() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  public static Singleton05 getInstance() {
    if (INSTANCE == null) {
      synchronized (Singleton05.class) {
        if (INSTANCE == null) {
          // 模拟创建对象比较慢
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          INSTANCE = new Singleton05();
        }
      }
    }
    return INSTANCE;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(Singleton05.getInstance().hashCode())).start();
    }
  }

}
