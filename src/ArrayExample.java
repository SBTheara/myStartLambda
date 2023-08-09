import java.lang.Math; // importing java.lang package
import java.util.Arrays;

public class ArrayExample {
    public static void main(String args[]) {
        double[] arr = new double[]{1.0,2.0,3.0,4.0,5.0};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.stream(arr).mapToObj(i->i*i).forEach(System.out::println);
        Arrays.stream(arr).mapToObj(i->Math.sqrt(i)).forEach(System.out::println);
        double average = Arrays.stream(arr).average().orElse(0.0);
        double max=Arrays.stream(arr).max().orElse(0.00);
        System.out.println(Arrays.stream(arr).min().orElse(0.0));
        System.out.println(max);
        System.out.println(average);


    }
}
