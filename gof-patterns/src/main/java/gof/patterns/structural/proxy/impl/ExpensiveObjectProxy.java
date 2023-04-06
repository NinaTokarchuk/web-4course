package gof.patterns.structural.proxy.impl;

import gof.patterns.structural.proxy.ExpensiveObject;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject INSTANCE;

    @Override
    public void process() {
        if (INSTANCE == null) {
            INSTANCE = new ExpensiveObjectImpl();
        }
        INSTANCE.process();
    }
}
