package recursive;

public class UserRecursive {
    public static void main(String[] args) {
        System.out.println(SumRecursive(100));
        Sum(100);
        factorial(5);
        System.out.println(factoricalONe(5));
    }
    public static int SumRecursive(int i){
        int sum=0;
        sum +=i;
        if (i==1){
           return 1;
        }
        return i+SumRecursive(i-1);
    }
    public static void Sum(int i){
        int sum=0;
        for (int i1 = i; i1 > 0; i1--) {
            sum+=i1;
        }
        System.out.println(sum);
    }
    public static void factorial(int i){
        int sum=1;
        for (int i1 = i; i1 > 0; i1--) {
            sum*=i1;
        }
        System.out.println(sum);
    }
    public static int factoricalONe(int i){
        if (i==1){
            return 1;
        }
        return i*factoricalONe(i-1);

    }
}
