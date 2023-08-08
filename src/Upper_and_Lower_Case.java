import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Upper_and_Lower_Case {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("Green","Pink","Meow");
        System.out.println("The original");
        alpha.forEach((n) ->{System.out.println(n);});
        System.out.println("The Uppercase");
        alpha.replaceAll((n)->n.toUpperCase());
        alpha.forEach((n)->{System.out.println(n);});
        System.out.println("The Lowercase");
        alpha.replaceAll((n)->(n.toLowerCase()));
        alpha.forEach(n-> System.out.println(n));
    }
}
