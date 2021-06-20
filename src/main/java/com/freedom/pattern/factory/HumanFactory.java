package com.freedom.pattern.factory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:53
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        T instance = null;
        try {
            instance = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("创建人类失败");
        }
        return instance;
    }
}
