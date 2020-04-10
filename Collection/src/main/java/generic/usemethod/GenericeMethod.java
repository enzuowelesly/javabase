package generic.usemethod;
/*
* 权限修饰 和返回类型之间 <E>
 */
public class GenericeMethod {
    public <E> void show(E e){
        System.out.println(e);
    }
    public static <E> void showStatic(E e){
        System.out.println(e);
    }

}
