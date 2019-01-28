package com.luno.softone.pattern.learn.strategy;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: OperationMultiply
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 14:12
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class OperationMultiply implements Strategy {


    public int doOperation(int a , int b) {
        return a * b ;
    }
}
