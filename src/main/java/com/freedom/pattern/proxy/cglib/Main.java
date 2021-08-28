package com.freedom.pattern.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib无需接口就可以生成代理类
 *
 * @author tobebetter9527
 * @create 2021/08/01 9:40
 */
public class Main {

  public static void main(String[] args) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(Bird.class);
    enhancer.setCallback(new BirdLogInterceptor());
    Bird bird = (Bird) enhancer.create();
    bird.fly();
  }

}

class BirdLogInterceptor implements MethodInterceptor {

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
    System.out.println(obj.getClass().getSuperclass().getName());
    System.out.println("开始打印日志");
    Object o = proxy.invokeSuper(obj, args);
    System.out.println("结束打印日志");
    return o;
  }
}


class Bird {

  public void fly() {
    System.out.println("I can fly ...");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}