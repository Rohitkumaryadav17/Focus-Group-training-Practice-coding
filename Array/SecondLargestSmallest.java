import java.util.*;

public class SecondLargestSmallest {

    public static void main(String[] args) {

        int arr[] = {1,2,4,7,7,5};

        Arrays.sort(arr);

        int secondSmall = -1;
        int secondLarge = -1;

        int smallest = arr[0];
        int largest = arr[arr.length-1];

        for(int i=0;i<arr.length;i++){
            if(arr[i] != smallest){
                secondSmall = arr[i];
                break;
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != largest){
                secondLarge = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest: " + secondSmall);
        System.out.println("Second Largest: " + secondLarge);
    }
}