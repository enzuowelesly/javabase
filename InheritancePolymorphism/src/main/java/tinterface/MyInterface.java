package tinterface;

public interface MyInterface {
//0、成员变量  常量
    public static final int num=10;
    //1、抽象方法
    public abstract void abstractMethod();
//2、静态方法
     public default void defaultMethodOne(){
        System.out.println("default method one ");
    }
    public default void defaultMethodTwo(){
        System.out.println("default method two ");
    }
    //4、私有默认方法
//      private   default void defaultCommon(){
//          System.out.println("defaultcommon   接口内调用的default方法，java9提供，只有公共的默认方法可以调用");
//    }
    //3、静态方法
    public static void staticMethod(){
        System.out.println("static method");
    }
    //5 私有静态方法
//    private static void staticCommon(){
//        System.out.println("static method 接口内调用的静态方法，java9提供，只有公共的默认方法可以调用");
//    }
    //6、不能有静态代码块
    //7、implements 可是实现多个接口，必须实现所的抽象方法
    //8、实现的多个接口，有重复的方法，覆盖重写一次就行
    //9、如果实现类没有覆盖重写所有的接口中的抽象方法，name实现类就必须是一个抽象类
    //10、extends 和impelements 中间的方法冲突时，优先使用父类中的方法
}
