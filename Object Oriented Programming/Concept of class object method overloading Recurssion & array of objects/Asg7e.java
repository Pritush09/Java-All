import java.util.*;

class shape{
    public void rect(int a, char b){
        for(int i = 0; i <a; i++){
            for(int j = 0; j <a; j++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
    public void rect(int a, int c,char b){
        for(int i = 0; i <a; i++){
            for(int j = 0; j <c; j++){
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
}

class Asg7e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        shape s = new shape();
        System.out.println("Enter the character");
        char c = sc.next().charAt(0);
        s.rect(side, c);
        System.out.println("");
        System.out.println("Enter the length : ");
        int l = sc.nextInt();
        System.out.println("ENter the breadth : ");
        int b = sc.nextInt();
        System.out.println("Enter the character : ");
        char r = sc.next().charAt(0);
        s.rect(b, l, r);
        sc.close();
    }
}
