package com.freedom.pattern.prototype;

import java.util.Random;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/05 21:31
 */
public class Client {
    private static final int MAX_NUM = 9;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdTemplate());
        mail.setTail("xx版权所有");
        System.out.println("origal:" + mail);
        while (i <= MAX_NUM) {
            Mail clone = mail.clone();
            clone.setAppellation(getName(5) + "先生/女士");
            clone.setReceiver(getName(5) + "@qq.com");
            System.out.println("clone:" + clone);
            System.out.println(clone.getSubject() + clone.getReceiver() + "发送成功");
            i++;
        }
    }

    private static String getName(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwsyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
