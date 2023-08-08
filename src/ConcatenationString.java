import java.util.function.BiFunction;

public class ConcatenationString {
    public static void main(String[] args) {
        BiFunction<String,String,String> concatinate = (s1,s2)->s1+s2;
        String f1="hello";
        String f2=" world";
        String f3 = concatinate.apply(f1,f2);
        System.out.println(f3);
    }
}
