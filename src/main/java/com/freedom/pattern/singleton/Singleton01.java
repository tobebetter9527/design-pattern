package com.freedom.pattern.singleton;

/**
 * 饿汉式
 * <p>
 * 类加载的时候就实例化，保证线程安全, 简单实用。 缺点：如果不用也实例化，占内存。
 * </p>
 *
 * @author tobebetter9527
 * @create 2021/07/24 11:08
 */
public class Singleton01 {

  private static Singleton01 INSTANCE = new Singleton01();

  private Singleton01() {
  }

  public void doSomething() {
    System.out.println("Do something");
  }

  public static Singleton01 getInstance() {
    return INSTANCE;
  }

  public static void main(String[] args) {
    Singleton01 instance = Singleton01.getInstance();
    instance.doSomething();

    Singleton01 instance2 = Singleton01.getInstance();
    System.out.println(instance == instance2);
  }

}
