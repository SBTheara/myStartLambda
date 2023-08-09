import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class find_square_root_of_Odd_and_Even {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(6,4,6,7,7,3,2,5,7,8,7,6,6,8);

        int odd = number.stream().filter(n->n%2!=0).mapToInt(n->n*n).sum();
        int even = number.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
        System.out.println("\nThe even number");
        number.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));

        System.out.println("\nThe odd number");
        number.stream().filter(n->n%2!=0).forEach(n->{System.out.print(n+" ");});

        System.out.println("\nThe sorted number");
        number.stream().sorted((n1,n2)->n1.compareTo(n2)).forEach(n-> System.out.print(n+" "));

        System.out.println("\n"+odd);
        System.out.println(even);

        List<Integer> number1 = Arrays.asList(2,3,4,5);
        int square = number1.stream().mapToInt(x->x*x).sum();
        System.out.println(square);
    }
}
