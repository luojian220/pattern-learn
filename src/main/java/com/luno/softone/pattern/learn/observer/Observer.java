package com.luno.softone.pattern.learn.observer;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: Observer
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 11:18
 * @company:
 * @since JDK 1.7
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
