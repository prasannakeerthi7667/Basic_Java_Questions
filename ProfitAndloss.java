package basicjavaquestions;
import java.util.Scanner;

public class ProfitAndloss {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Cost Price:");
    double costPrice=sc.nextDouble();
    System.out.println("Enter Selling Price:");
    double sellingPrice=sc.nextDouble();
    if(sellingPrice>costPrice){
        System.out.println(sellingPrice-costPrice);

    }
    else if(sellingPrice<costPrice){
         System.out.println(costPrice-sellingPrice);

    }
    else{
        System.out.println("No Profit No Loss");
    }

}
}
