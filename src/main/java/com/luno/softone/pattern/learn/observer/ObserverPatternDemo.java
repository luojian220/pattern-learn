package com.luno.softone.pattern.learn.observer;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: ObserverPatternDemo
 * @Reason: 观察者模式
 * @date: 2019年01月25日 11:24
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
