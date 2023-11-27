import java.util.*;

abstract class Number{
    abstract void Display(int n);
}

class hexNum extends Number{
    void Display(int n){
        int r,num=n;
        String s = " ";
        char hex[] = {'0', '1', '2', '3', '4','5', '6', '7', '8', '9', 'A', 'B', 'C','D', 'E', 'F'};
        while (num > 0){
            r = num % 16;
            s = hex[r]+s;
            num = num / 16;
        }
        System.out.println("Hexadecimal number : "+s);
    }
}

class octNum extends Number{
    void Display(int n){
        int r,num=n;
        String s = " ";
        char hex[] = {'0', '1', '2', '3', '4','5', '6', '7'};
        while (num > 0){
            r = num % 8;
            s = hex[r]+s;
            num = num / 8;
        }
        System.out.println("octal number : "+s);
    }
}

public class Asg8b {
    public static void main(String[] args) {
        int n;Number obj;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number : ");
        n = sc.nextInt();
        obj = new hexNum();
        obj.Display(n);
        obj = new octNum();
        obj.Display(n);
        sc.close();
    }
}

// can create references of type Number and then instantiate objects of its concrete subclasses (hexNum and octNum). This is possible
//  because both hexNum and octNum extend the abstract class Number. This is an example of polymorphism and dynamic method dispatch in Java.
