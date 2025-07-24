package basicjavaquestions;

public class ArthimeticMean {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;  
        int sum=0;
        for(int i=0;i<n;i++){
             sum=sum+arr[i];

    }
    
    System.out.println("Am is: "+(sum/n));
}
    
}
