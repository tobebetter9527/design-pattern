package com.freedom.pattern.facade;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 16:39
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA() {
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodB() {
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
