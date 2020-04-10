package generic.usemethod;

public class UserGenericeMethod {
    public static void main(String[] args) {
        GenericeMethod genericeMethod =new GenericeMethod();
        genericeMethod.show("enzo");
        genericeMethod.show(123);
        GenericeMethod.showStatic("eeeee");
        GenericeMethod.showStatic(12333);
    }
}
