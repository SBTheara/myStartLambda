import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        numbers.add(10);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        ArrayList<String> Province = new ArrayList<>();
        Province.add("Kandal");
        Province.add("Takeo");
        Province.add("Phnom penh");
        Province.add("Kompong Speiu");
        Province.add("Kompong Thom");
        Province.add("Helooworld");
        Consumer<String> methods = (n) -> {
            System.out.println(n);
        };
        Province.forEach(methods);
    }
}