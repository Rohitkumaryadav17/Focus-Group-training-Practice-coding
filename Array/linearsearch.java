import java.util.*;
public class linearsearch {
    public static int LinearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
             return i;

            }
        }
        return -1;
            
    }
    public static void main(String[] args) {
        int arr[]={2,3,45,6,7,88,9,0};
        int key =7;
       System.out.println(LinearSearch(arr, key));
        
    }
}

