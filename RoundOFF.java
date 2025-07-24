package basicjavaquestions;
import java.util.Scanner;

public class RoundOFF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        Float number=sc.nextFloat();
        int number1=Math.round(number);
        System.out.println(number1);

        
    }
    
}
