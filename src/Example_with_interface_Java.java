interface StringFunction {
    String run(String str);
}

public class Example_with_interface_Java {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        StringFunction hello = (n) -> n + "Hellowrld";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        String resu= hello.run("pev");
        System.out.println(resu);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
