import java.util.*;
public class  fibonic{
    public static int sumfibonic(int n){
    
    int a=0; int b=1;
    int next=0;
    for(int i=1;i<n;i++){
        System.out.print(a+ " ");
         next=a+b;
        a=b;
        b =next;

    }
return next;
    
}


public static void main(String[] args) {
    int n=25;
    System.out.print(sumfibonic(n));
        
    }
}
