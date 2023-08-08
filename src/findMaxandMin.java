import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findMaxandMin {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,5,6,7,4,3,5,7,8,6,5,7);

        Optional<Integer> max= number.stream().max((n1,n2)->n1.compareTo(n2));
        System.out.println(max.orElse(null));

        Optional<Integer> min = number.stream().min((n1,n2)->n1.compareTo(n2));
        System.out.println(min.orElse(null));
    }
}
