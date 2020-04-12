package args;
/*
* 方法参数的类型已经确定，个数不确定  (类型 ... arr)
*一个方法的列表只能有一个可变参数
*可变的参数的类型必须确定
* 参数列表有多个时，可变参数放在参数列表最后
* */
public class UseArgs {
    public static void main(String[] args) {
        System.out.println(addint(1,2));
        System.out.println(addintmore(1,2,3));
    }
    public static int addint(int a ,int b){
        return a+b;
    }
    public static int addintmore(int ...arr){
        System.out.println(arr.length);
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
