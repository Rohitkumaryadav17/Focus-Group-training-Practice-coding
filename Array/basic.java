import java.util.*;
public class basic {
    public static void inputoutput( ){
         int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        // int phy;
       // phy=sc.nextInt();
       System.out.print("Enter physic marks :");
       marks[0]=sc.nextInt();
       System.out.print("Enter chemistry marks :");
       marks[1]=sc.nextInt();
       System.out.print("Enter math marks ");
       marks[2]=sc.nextInt();


      System.out.println("physic : "+marks[0]);

      System.out.println("physic : "+marks[1]);

      System.out.println("physic : "+marks[2]);
      int percentage=marks[0]+marks[1]+marks[2]/3;
      System.out.println("percenatgev: "+percentage+"%");


    }  
      public static void main(String[] args) {
      int a=inputoutput();
      
       
        
        
    }
    
}
