import java.util.*;
class FuncMethods {
    // nameprint jo he vo identifier he jisse identify ho ky aho raha h ud function me 
    // this is a camel case way jisme pehla word is small and bakki ke sare words ka first letter capital hoga 
    public static void namePrint(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println();
        namePrint(name);
        sc.close();
    }
}
