import java.util.function.Predicate;

public class findPalindromeword {
    public static void main(String[] args) {
        Predicate <String> isPalidrome = s->{
            String str = new StringBuilder(s).reverse().toString();
            return s.equals(str);
        };

        String text="heeh";
        boolean ispali = isPalidrome.test(text);
        System.out.println(ispali);

        String text1="Helloworld";
        boolean ispali2 = isPalidrome.test(text1);
        System.out.println(ispali2);
    }
}
