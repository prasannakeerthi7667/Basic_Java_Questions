package basicjavaquestions;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        
        switch (day.toLowerCase()){
            case "monday":
            System.out.println("MONDAY");
            break;
            case "tuesday":
            System.out.println("TUESDAY");
             break;
            case "Wednesday":
            System.out.println("WEDNESDAY");
             break;
            case "thursday":
            System.out.println("THURSDAY");
             break;
            case "friday":
            System.out.println("FRIDAY");
             break;
            case "saturday":
            System.out.println("SATURDAY");
             break;
            case "sunday":
            System.out.println("SUNDAY");
             

        }
    }
}
