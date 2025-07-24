package basicjavaquestions;

public class SumOfEvenProductOfOdd {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        for(int i=1;i<=20;i++){
            if(i%2==0){
                a+=i;
            }
            else{
                b*=i;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

    
}
