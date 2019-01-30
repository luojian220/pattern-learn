package com.luno.softone.pattern.learn.observer;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: OctalObserver
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 11:22
 * @company:
 * @since JDK 1.7
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
