package com.freedom.pattern.singleton;

/**
 * 懒汉式，实现了按需加载，线程是安全了，但是获得实例对象的操作都是
 * 串行化，影响性能
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton04 {

  private static Singleton04 INSTANCE;

  private Singleton04() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  /**
   * synchronize修饰静态方法，它的锁就是当前的类对象，相当于synchronized(Singleton04.class)
   */
  public static synchronized Singleton04 getInstance() {
    if (INSTANCE == null) {
      // 模拟创建对象比较慢
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      INSTANCE = new Singleton04();
    }
    return INSTANCE;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(Singleton04.getInstance().hashCode())).start();
    }
  }

}
