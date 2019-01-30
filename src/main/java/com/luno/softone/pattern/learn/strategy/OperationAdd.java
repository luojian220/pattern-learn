package com.luno.softone.pattern.learn.strategy;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: OperationAdd
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 14:09
 * @company:
 * @since JDK 1.7
 */
public class OperationAdd implements Strategy {

    public int doOperation(int a , int b) {
        return a + b ;
    }
}
