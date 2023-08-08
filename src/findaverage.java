import java.util.Arrays;
import java.util.List;

public class findaverage {
    public static void main(String[] args) {
        List<Double> number = Arrays.asList(12.2,33.2,33.3,44.7,29.4,50.66);
        double avg = number.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(avg);

        List<Integer> num = Arrays.asList(4,3,2);
        double average = num.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(average);

        List<String> name = Arrays.asList("theara","Pev","kikilu","nha","sakira","alibaba","mr.fantastic");
        name.sort((o1, o2) -> (o1.compareToIgnoreCase(o2)));
        name.forEach(n->{
            System.out.println(n);
        });
    }
}
