package com.freedom.pattern.strategy.comparable;

import java.util.Comparator;

/**
 * @author tobebetter9527
 * @description 姓名比较器
 * @create 2021/07/24 16:27
 */
public class PeopleNameComparator implements Comparator<People> {

  @Override
  public int compare(People o1, People o2) {
    int i = o1.getName().compareTo(o2.getName());
    if (i > 0) {
      return -1;
    } else if (i < 0) {
      return 1;
    } else {
      return 0;
    }
  }
}
