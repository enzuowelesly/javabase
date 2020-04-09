package tinterface;

public interface HisInterface {
    public abstract void show();
    public abstract void abstractMethod();
    public default void defaultMethodOne(){
        System.out.println("default method one  his interface ");
    }
    public static void staticMethod(){
        System.out.println("static method his interface ");
    }
}
