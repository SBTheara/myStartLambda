import java.util.Scanner;
import java.util.function.LongUnaryOperator;

public class factorial {
    public static void main(String[] args) {
        LongUnaryOperator factorial = (n)->{
            long result = 1;
            for(int i=1;i<=n;i++){
                result*=i;
            }
            return result;
        };
        Scanner sc = new Scanner(System.in);
        long f=sc.nextInt();
        long res=factorial.applyAsLong(f);
        System.out.println(res);
    }
}
