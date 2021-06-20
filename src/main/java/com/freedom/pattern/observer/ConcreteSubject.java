package com.freedom.pattern.observer;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 23:08
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
