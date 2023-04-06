package gof.patterns.structural.proxy;

import gof.patterns.structural.proxy.impl.ExpensiveObjectProxy;

public class Demo {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
