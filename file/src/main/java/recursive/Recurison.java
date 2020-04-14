package recursive;
/*
* 递归：
* 直接递归
* 间接递归
*注意事项
* 有条件限定
* 递归的次不能太多
* 构造方法禁止递归
*
* 递归使用前提
* 当调用方法时，方法的主体不变，每次调用的方法的参数不同，可以使用递归
* */
public class Recurison {
    public static void main(String[] args) {
//        recurisive();
            recurisiveTwo(1);
    }
    public static void recurisiveTwo(int i){
        System.out.println(i);
        if (i==100){
            return;
        }
        recurisiveTwo(++i);
    }
    public static void recurisive(){
        System.out.println("recruisive method");
        recurisive();

    }
}
