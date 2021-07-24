package com.freedom.pattern.strategy.comparable;

import java.util.Comparator;

/**
 * @author tobebetter9527
 * @description 年龄比较器
 * @create 2021/07/24 16:27
 */
public class PeopleAgeComparator implements Comparator<People> {

  @Override
  public int compare(People o1, People o2) {
    if (o1.getAge() > o2.getAge()) {
      return -1;
    } else if (o1.getAge() < o2.getAge()) {
      return 1;
    } else {
      return 0;
    }
  }
}
