package basicjavaquestions;

public class Swap2NUmbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
