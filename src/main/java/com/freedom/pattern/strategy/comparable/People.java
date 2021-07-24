package com.freedom.pattern.strategy.comparable;

import java.util.ArrayList;
import java.util.List;

/**
 * 人有年龄和姓名，可以按照年龄排序，也可以按照姓名排序等等。
 *
 * @author tobebetter9527
 * @create 2021/07/24 16:27
 */
public class People {

  private Integer age;
  private String name;

  public People(Integer age, String name) {
    this.age = age;
    this.name = name;
  }

  public static void main(String[] args) {
    List<People> list = new ArrayList<>();
    list.add(new People(30, "张三"));
    list.add(new People(20, "李四"));
    list.add(new People(33, "王五"));
    System.out.println(list);
    list.sort(new PeopleAgeComparator());
    System.out.println(list);
    list.sort(new PeopleNameComparator());
    System.out.println(list);
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "People{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}
