import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDouplicateNumber {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,7,7,6,5,5,1,4,9,8,8,0,0,4,5);
        number.forEach((n)->{
            System.out.print(n+" ");
        });
        System.out.println("");
        List<Integer> uniqueNum = new ArrayList<>();
        number.stream().distinct().forEach(uniqueNum::add);
        uniqueNum.forEach((n)->{
            System.out.print(n +" ");
        });
    }
}
