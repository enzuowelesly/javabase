package tfinal;
//final 修饰一个局部变量，只能赋值一次
//基本数据类型存的数值，不能改变
//引用数据类型存储的地址，不能改变，能改变的是通过调用方法改变值 如setter
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
