package com.luno.softone.pattern.learn.strategy;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: Context
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 14:13
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class Context {

    private Strategy strategy ;
    public Context(Strategy strategy) {
        this.strategy = strategy ;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a , int b) {
        return strategy.doOperation(a,b);
    }
}
