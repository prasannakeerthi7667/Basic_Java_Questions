package basicjavaquestions;

import java.util.Scanner;

public class FactorsofAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }

        }
        
    }
    
}
