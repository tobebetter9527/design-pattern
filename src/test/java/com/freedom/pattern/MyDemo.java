package com.freedom.pattern;

import java.io.BufferedInputStream;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2021/07/23 21:30
 */
public class MyDemo {

  public static void main(String[] args) {
    println(1);
  }

  public static void println(int num) {
    for (int i = 31; i >= 0; i--) {
      System.out.print((num & (1 << i)) == 0 ? "0" : "1");
    }
  }


}
