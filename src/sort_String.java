import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class sort_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fruit= Arrays.asList("Apple","Jack fruit","Banana","Coconut","Dragon fruit");
        System.out.println("The original list of string");
        fruit.forEach((n)->{
            System.out.println(n);
        });
        System.out.println("The sorted list of fruit");
        fruit.sort((n1,n2)-> n1.compareToIgnoreCase(n2));
        fruit.forEach((n)->{System.out.println(n);});
    }

}
