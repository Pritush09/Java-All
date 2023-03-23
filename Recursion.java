class Recursion {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
    //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
    //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
    //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    

    public static String revString(String str) {
        if(str.length() == 1) {
        return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
    }
    

    
    public static int first = -1;
    public static int last = -1;

    public static void getIndices(String str, char el, int idx) {
        if(idx == str.length()) {
            return;
        }
        if(str.charAt(idx) == el) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        getIndices(str, el, idx+1);
    }

    
    

    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");

        System.out.println();

        String str = "abcd";
        String reverse = revString(str);
        System.out.println(reverse);

        System.out.println();

        String st = "tabcdfghijakkk";
        char el = 'a';
        getIndices(st, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
            
}
