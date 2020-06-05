package com.design.mediator.v1;

/**
 * 中介者模式(调停模式) - 未使用中介者模式调用麻烦，调用链复杂
 *
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护
 *
 * @author wliduo[i@dolyw.com]
 * @date 2020/6/5 10:26
 */
public class Main {

    public static void main(String[] args) {
        SubSystem1 subSystem1 = new SubSystem1();
        SubSystem2 subSystem2 = new SubSystem2();
        SubSystem3 subSystem3 = new SubSystem3();
        subSystem1.send("hi1");
        System.out.println("-----");
        subSystem2.send("hi2");
        System.out.println("-----");
        subSystem3.send("hi3");
    }

}
