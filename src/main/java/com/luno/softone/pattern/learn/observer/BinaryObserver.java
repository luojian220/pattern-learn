package com.luno.softone.pattern.learn.observer;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: BinaryObserver
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 11:21
 * @company:
 * @since JDK 1.7
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
