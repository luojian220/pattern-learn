package com.luno.softone.pattern.learn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: Subject
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 11:17
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class Subject {


    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
