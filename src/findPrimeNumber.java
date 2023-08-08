import java.util.function.Predicate;

public class findPrimeNumber {
    public static void main(String[] args) {
        Predicate<Integer> number = (n)->{
            if(n<0)
                return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        };
        boolean res = number.test(12);
        System.out.println(res);
    }
}
