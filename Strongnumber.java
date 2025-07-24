package basicjavaquestions;
import java.util.Scanner;

public class Strongnumber {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int value=sc.nextInt();
        String number1=Integer.toString(value);
        int len=number1.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int Fact=1;
            int digit=(int)number1.charAt(i)-'0';
            for(int j=1;j<=digit;j++){
            Fact=Fact*j;
            }
            sum+=Fact;
        }

        if(value==sum){
            System.out.println("Strong number");

        }
        else{
            System.out.println("Not strong number");
        }
            
    
    

        }
    
    }

    
