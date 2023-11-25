import java.util.*;

class Nonfibo{
    void fibo(int n, int a, int b, int c){
        if (n > 0){
            for(int i=a+1;i<b;i++){
                if(c>0){
                    System.out.print(i+" ");
                    c--;
                }
            }
            fibo(n-1, b, a+b, c);
        }
    }
    
}

class Asg7c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Nonfibo nfibo = new Nonfibo();
        nfibo.fibo(n, 0, 1, n);
        sc.close();
    }
}
