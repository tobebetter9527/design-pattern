package com.freedom.pattern.singleton;

/**
 * 枚举实现方式：线程安全，不被反序列化
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public enum Singleton08 {

  INSTANCE;

  public void doSomething() {
    System.out.println("Do something");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(Singleton08.INSTANCE.hashCode())).start();
    }
  }

}
