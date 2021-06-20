package com.freedom.pattern.singleton;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:12
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            SingleObject instance = SingleObject.getInstance();
            instance.showMessage();
        }
    }
}
