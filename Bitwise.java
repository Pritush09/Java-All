import java.util.Scanner;

public class Bitwise {
    // changes we try to perform in a number is called bitmask
    // there is different bitmask for every operation

    public static void main(String[] args) {
        // position rightside se start ho raha
        int n = 5;
        int pos = 2;
        int ps = 1;
        int bitmask = 1<<pos;
        int bitmask1 = 1<<ps; 

        // Get Bit
        // 1<<i  then ANd operation performed
        if ((bitmask & n) == 0){
            System.out.println("Bit was 0");
        }else{
            System.out.println("Bit was 1");
        }

        // Set Bit
        // 1<< i then OR 
        if ((bitmask1 | n) == 0){
            System.out.println("Bit was 0");
        }else{
            System.out.println("Bit was 1");
        }
        int num = bitmask1 | n;
        System.out.println(num);

        System.out.println();

        // Clear BIT
        // 1<<i  and then NOT it and then AND with the number
        int mask = 1<<pos;
        mask = ~mask;
        int numb = (mask & n);
        System.out.println(numb);

        System.out.println();

        //Update bit 
        // for 0 -  1<<i then NOT karo uska  then AND karo resultant ka 
        // for 1  -  1<<i then OR with the no.
        System.out.print("\nENter the number : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print("\nENter the position u want to change :");
        int poss = sc.nextInt();

        System.out.print("\nEnter choice 1 or 0 : ");
        int choice = sc.nextInt();

        int shifting = 1<<poss;

        if (choice == 1){
            System.out.print((shifting | input));
        }else{
            shifting = ~shifting;
            System.out.print((shifting & input));
        }
        sc.close();
    }
}
