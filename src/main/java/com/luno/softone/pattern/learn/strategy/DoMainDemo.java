package com.luno.softone.pattern.learn.strategy;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: 策略模式
 * @Description:
 * @date: 2019年01月25日 14:15
 * @company:
 * @since JDK 1.7
 */
public class DoMainDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        int ret1 = context.executeStrategy(3,4);
        System.out.println("OperationAdd [3,4] :" + ret1 );

        context = new Context(new OperationSub());
        //context.setStrategy(new OperationSub());
        int ret2 = context.executeStrategy(3,4);
        System.out.println("OperationSub [3,4] :" + ret2 );

        context= new Context(new OperationMultiply());
        //context.setStrategy(new OperationMultiply());
        int ret3 = context.executeStrategy(3,4);
        System.out.println("OperationMultiply [3,4] :" + ret3 );


    }
}
