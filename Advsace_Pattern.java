public class Advsace_Pattern {
    public static void main(String [] args) {
        int n = 5;

        // Buterfly 
        // Upper wing
        for (int i = 1; i <= n; i++) {
            //simple printing the puramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // the spaces whic are denoted by 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // the stars for lower part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower wing
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // SOLID RHOMBUS

        for (int i =1 ; i<=n ; i++){
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

        // NUMBER PYRAMID
        for (int i=1; i<=n ; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



        // Palindromic pattern 
        for (int i = 1 ; i<=5 ; i++){
            for (int j =1 ; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j = i ; j>=1 ; j--){
                System.out.print(j);
            }
            for (int j =2 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Diamond pattern 
        for (int i = 1; i<=4 ; i++){
            for (int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            for (int j =2 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 4; i>=1 ; i--){
            for (int j = 1; j<4-i+1; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=2*i-1 ; j++){
                System.out.print("*");
            }

            System.out.println();

        }


    }
}

        
    
