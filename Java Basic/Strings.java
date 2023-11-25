import java.util.*;
// we write strings as there is already aclass called string in java

// Strings are immutable 
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.length()); 
        
        //char at

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }


        // Compare Strings
        String nn = "name";
        String m = "mane";
        // 1 - s1 > s2 = +ve value;
        // 2 - s1==s2  = 0;
        // 3 - s1<s2  = -ve value;

        // hello < wello  as a<b<c<....<z  it is compared from the starting 
        // aahello  aawello  then the aawello is greater

        // we can use s1 == s2 in if statement but it will be failing in some testcases 

        if (nn.compareTo(m)==0){
            System.out.println("\n nn == m ");
        }else{
            System.out.println("not equal");
        }



        // this will give string nnot equal  eventough they are the same becz strings in java are stored in different formats than the variable 
        if(new String("tony") == new String("tony")){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }


        // Sub strings 
        String nam = "tonny and monny";
        // substring(starting index , ending index)
        // ending index nahi doge toh by default last waala 
        String monny = nam.substring(10);
        System.out.println(monny);

        sc.close();
    }
    
}
