public class Bitwise {
    // changes we try to perform in a number is called bitmask
    // there is different bitmask for every operation

    public static void main(String[] args) {
        // position rightside se start ho raha
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        if ((bitmask & n) == 0){
            System.out.println("Bit was 0");
        }else{
            System.out.println("Bit was 1");
        }
    }
}
