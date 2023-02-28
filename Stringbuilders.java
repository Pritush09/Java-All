import java.util.*;
public class Stringbuilders {
    public static void main(String[] args) {
        // first the variable str will be created inside stack and then the string of the sttr will be created inside heap and str will point towards
        // it every time we update aur add a character it will create a new string inside of heap and and str will now point towards the new string
        // this will hamper the user experince as it will take much more time 
        // THE ABOVE IS WITHOUT STRING BUILDER 

        //STRING BUILDER 
        // it point towards the same string in the heap and update the changes in the stame string in heap without creating a new string in heap
        //and changing the pointer again and agian


        StringBuilder sb = new StringBuilder("stringbuilder");
        System.out.println(sb.charAt(0));

        // set character at index
        sb.setCharAt(0, 'M');
        // isko print ke andar print nahi karwa sakte bcz iske andar changes hoga print usko print nahi karsakta direct

        System.out.println(sb);

        System.out.println();

        // inserting the character
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);


        // Deleting 
        sb.delete(0, 2); // 2 is not included
        System.out.println(sb);


        // Appending
        sb.append("ner");
        System.out.println(sb);

        //lenght
        System.out.println(sb.length());


        //Reverse a string
        Scanner sc = new Scanner(System.in); 
        String nnam = sc.next();
        System.out.println();
        // via string builder
        StringBuilder names = new StringBuilder(nnam);
        for(int i = names.length()-1;i>=0;i--){
            System.out.print(names.charAt(i));
        }

        System.out.println();

        // another logic 
        StringBuilder mane = new StringBuilder(names);
         for (int i =0 ; i < names.length()/2;i++){
            int front = i;
            int back = mane.length()-1-i;

            char frontchar = mane.charAt(front);
            char backchar = mane.charAt(back);

            mane.setCharAt(front, backchar);
            mane.setCharAt(back, frontchar);
         }
         System.out.println(mane);

    }
}
