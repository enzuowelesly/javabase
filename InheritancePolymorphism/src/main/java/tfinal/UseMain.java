package tfinal;
//final 修饰一个局部变量，只能赋值一次
public class UseMain {
    public static void main(String[] args) {
        final int num3=1;
        //num3=10;
        System.out.println(num3);
        UserFinal userFinal =new UserFinal();
        userFinal.finalMethod();
        userFinal.method();
    }
}
