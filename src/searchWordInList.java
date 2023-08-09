import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
public class searchWordInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List< String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        String search = sc.nextLine();
        Predicate<String> isFound = n->n.equals(search);
        boolean isFind = colors.stream().anyMatch(isFound);
        String res = (isFind == true)?"This search was found":"Not found";
        System.out.println(res);
    }
}
