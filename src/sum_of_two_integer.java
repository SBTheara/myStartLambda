import org.w3c.dom.ls.LSOutput;

interface Sum{
    int sum(int x,int y);
}
public class sum_of_two_integer {
    public static void main(String[] args) {
        Sum s = (n,m)->n+m;
        int result = s.sum(5,8);
        int result2 = s.sum(6,-29);
        System.out.println(result);
        System.out.println(result2);
    }
}
