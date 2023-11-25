//import java.util.*;
class Pattern{
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        // pattern 
//      *****
//      *   *
//      *   *
//      *****
        for(int i = 1 ; i<=n ; i++){
            for (int j =1 ; j<=m ;  j++){
                if (i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        for (int i = 1; i<=n ; i++){
            for (int j = 1; j<=m-i; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        // Flyoids Triangle
        int s =1;
        for (int i =1 ; i<=5 ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }  


        // binary pattern

        for (int i=1;i<=5;i++){
            if (i%2==0){
                for(int j =1 ; j<=i ; j++){
                    if ( (j%2!=0) ){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            else{
                for (int j =1 ; j<=i ; j++){
                    if ( (j%2!=0) ){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }


        

    }
}
