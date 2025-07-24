package basicjavaquestions;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr={14,17,21};
        int start=11;
        int end = 20;
        findMissingnumbers(arr, start, end);
    }

    static void findMissingnumbers(int [] arr,int start, int end){
        int[] arr2 = new int[end-start];

       
        int index =0;
        for(int i=start; i<end;i++) {
         boolean isPresent =false;   
            for(int value:arr){
                if(i == value) {
                    isPresent = true;
                    break;
                }

            }
            if(isPresent == false) {
                arr2[index] = i;
                index++;
            }

        }
        for(int value1: arr2){

        System.out.println("Missing numbers are: "+value1);
        }
    
    }
}
    

