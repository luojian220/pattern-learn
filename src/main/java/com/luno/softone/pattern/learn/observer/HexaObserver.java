package com.luno.softone.pattern.learn.observer;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: HexaObserver
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 11:23
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
