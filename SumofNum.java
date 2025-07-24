package basicjavaquestions;
import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        String number1=Integer.toString(number);
        int len=number1.length();
        int a=0;
        for(int i=0;i<len;i++){
             a+=(int)(number1.charAt(i)-'0');

        }
        System.out.println(a);
    }

    
}
