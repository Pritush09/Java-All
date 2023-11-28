class A extends Thread{
    public void run() {
        try{
            for(int i=1; i<=10;i++){
                System.out.println(i+" ");
            }
        }catch (Exception e){
            System.out.println("Exception caught : "+ e.getMessage());
        }
    }
}

class B extends Thread{
    public void run() {
        try{
            for(int i=10; i>=1;i--){
                System.out.println(i+" ");
                if (i==6){
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            System.out.println("Exception caught : "+ e.getMessage());
        }
    }
}

/**
 * Asg10a
 */
public class Asg10a {
    public static void main(String[] args) {
        A x = new A();
        B y = new B();
        x.start();
        y.start();
    }
}
