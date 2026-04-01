public class twosum {
    public static int Twosum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return target;
                }
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,5,8,9,2,4};
        int target=8;
        int a=Twosum(arr, target);
        System.out.println(a);

        
    }
    
}
