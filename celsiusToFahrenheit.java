package basicjavaquestions;
import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celsius=sc.nextDouble();
        double faherheit=(celsius*9/5)+32;
        System.out.println(faherheit);
        
    }
    
}
