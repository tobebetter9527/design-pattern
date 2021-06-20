package com.freedom.pattern.factory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:56
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        whiteHuman.getColor();
        whiteHuman.talk();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
