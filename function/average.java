package function;
import java.util.*;
public class average{
    public static void avg( ){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.print("average of the number is :"+average);

    }
    public static void swap(){
        int a=5;
        int b=6;
        int temp=a;
             a=b;
             b=temp;
           System.out.println("value of a : "+a);
           System.out.println("value of b :"+b);
    }
    public static int Product(int a,int b){
         int prod=a*b;
         return prod;
    }
    public static int fact(int n){
         int f=1;
         for(int i=1;i<=n;i++){
             f=f*i;

         }
         return f;
      

    }
     public static void main(String[] args) {
        // avg();
        // swap();
        // System.out.println(Product(5, 8));
         System.out.println(fact(8));
        
    }
}
