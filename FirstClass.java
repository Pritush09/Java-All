// packages import karna hota he intelije me

/* The code below will print the words Hello World
to the screen, and it is amazing */

// as can be used as a variable name in java

// which datatype to use when here : https://www.w3schools.com/java/java_data_types_numbers.asp

// string methods  reference

import java.util.*;
class FirstClass{
    public static void main(String[] args) {
        int a=0;

        // For constant keyword no one cna change it 
        final int asa = 0;


        System.out.println(a);
        //system class he uske andar ka method he out and fir uske andar he println
        System.out.print("Hello, World ");
        //println matlab iske baad abdusra line me print karna he 
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        
        // INput string
        Scanner sc = new Scanner(System.in);
        //Scanner objects need to be closed after one is done using them. So, after you're done with it you should call
        // the following before the end of your main method
        /// String name = sc.next();
        // this will only take the one token from the string so inorder to in put some line with some spaces in b/w we use nextline function
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("\n");


        // to get more control over the random selection of variable
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
        // https://www.w3schools.com/java/java_ref_math.asp  for math module

        //INput int 
        int i = sc.nextInt();
        System.out.println("num : "+i);
        // Close tab karna he jab sab input lena hojae 
        sc.close();


        // short way to write only if and else when no elseif is required
        int time = 20;
        // if time less than 18 toh pehla wala otherwise dusra wala 
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int m = 0;
        do {
            System.out.println(m);
            m++;
        }while (m < 5);
    }
}