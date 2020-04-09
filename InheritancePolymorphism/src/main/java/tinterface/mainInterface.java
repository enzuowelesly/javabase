package tinterface;

import tinterface.impl.MyInterfaceimpl;

public class mainInterface {
    public static void main(String[] args) {
        MyInterfaceimpl myInterfaceimpl =new MyInterfaceimpl();
        myInterfaceimpl.abstractMethod();
        myInterfaceimpl.defaultMethodOne();
        myInterfaceimpl.defaultMethodTwo();
        MyInterface.staticMethod();
        int i = MyInterfaceimpl.num;
        System.out.println(i);
        System.out.println(MyInterface.num);
    }
}
