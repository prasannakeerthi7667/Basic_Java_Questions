package basicjavaquestions;
import java.util.Scanner;

public class NUmberOfDaysInAMonth {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("year is:");
    int year=sc.nextInt();
    sc.nextLine();
        System.out.println("month is:");
        String month=sc.nextLine();
        switch(month.toLowerCase()){
            case "january":
            System.out.println("31 Days");
            break;
            case "february":
            if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("29 Days");
            }
            else{
                System.out.println("28 days");
            }
            break;
            case "march":
            System.out.println("31 Days");
            break;
            case "april":
            System.out.println("30 Days");
            break;
            case "may":
            System.out.println("31 Days");
            break;
            case "june":
            System.out.println("30 Days");
            break;
            case "july":
            System.out.println("31 Days");
            break;
            case "August":
            System.out.println("31 Days");
            break;
            case "september":
            System.out.println("30 Days");
            break;
            case "october":
            System.out.println("31 Days");
            break;
            case "november":
            System.out.println("30 Days");
            break;
            case "december":
            System.out.println("31 Days");

        }

    }
}

