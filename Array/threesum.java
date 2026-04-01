import java.util.*;
public class threesum {
    public static int Threesum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        return target;
                    }
                  

                }
            }
            
        }
        
       return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,45,7,8,9,9,1};
        int target=244;
        int a=Threesum(arr, target);
        System.out.println(a);
        
        
    }
    
}
