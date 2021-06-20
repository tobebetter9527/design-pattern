package com.freedom.pattern.abstractfactory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/29 23:53
 */
public class MaleHumanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
