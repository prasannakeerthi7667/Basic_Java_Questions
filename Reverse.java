package basicjavaquestions;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        String num1=Integer.toString(num);
        int len=num1.length();
        int reverse=0;
        for(;num!=0;num/=10){
            int rem=num%10;
            reverse=reverse*10+rem;
        }
        System.out.println(reverse);
        
    }
    
}
