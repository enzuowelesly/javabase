package tinterface.impl;

import tinterface.HisInterface;
import tinterface.MyInterface;

public class MyInterfaceimpl implements MyInterface , HisInterface {
    @Override
    public void abstractMethod() {
        System.out.println("implements abstractmethod");

    }

    @Override
    public void defaultMethodOne() {
        System.out.println("多个接口中对冲突的默认方法进行重写覆盖");
    }

    @Override
    public void show() {
        System.out.println("his interface impl");
    }
}
