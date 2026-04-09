package pattern;

public class basic {
    public static void  starpattern(){
        // one line 
        for(int i=1;i<=4;i++){
            //  times of line 
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }


    } 
    public static void invertedstar(){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4-i+1;j++){
            System.out.print("x");
        }
        System.out.println();
    }
    }
    public static void halfpyramid(){
        // outer  loop ==kitne line  row 
        for(int i=1;i<=4;i++){
            // inner line= kitne time 
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // next line 
            System.out.println();
        }

    }
    public static void characterpattern(){
        int n=4;
        char ch='A';
        // outer loop 
        for(int i=1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void hollowrectangle( int totRows, int totcols){
        // outer loop =4  using matrix method
        for(int i=1;i<=totRows;i++){
            // inner loop 
            for(int j=1;j<=totcols; j++){
              // cell - (i,j)
              if(i==1 || i== totRows || j== 1 || j== totcols){
                // boundary cellls 
                System.out.print("*");
              }
              else{
                System.err.print( " ");
              }

            }
            System.out.println();
              

        }
    }

    public static void main(String[] args) {
   
        // starpattern();
        // invertedstar();
        // halfpyramid();
        // characterpattern();
        hollowrectangle(4, 5);


        
    }
    
}
