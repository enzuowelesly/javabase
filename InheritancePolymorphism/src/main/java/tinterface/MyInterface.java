package tinterface;

public interface MyInterface {
    public abstract void abstractMethod();
     public default void defaultMethodOne(){
        System.out.println("default method one ");
    }
    public default void defaultMethodTwo(){
        System.out.println("default method two ");
    }
//      private   default void defaultCommon(){
//          System.out.println("defaultcommon   接口内调用的default方法，java9提供，只有公共的默认方法可以调用");
//    }
    public static void staticMethod(){
        System.out.println("static method");
    }
//    private static void staticCommon(){
//        System.out.println("static method 接口内调用的静态方法，java9提供，只有公共的默认方法可以调用");
//    }
}
