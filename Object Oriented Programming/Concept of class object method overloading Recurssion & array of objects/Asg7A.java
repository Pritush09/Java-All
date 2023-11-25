import java.util.*;

class Room{
    float length,breadth,height;
    Room(float length,float breadth,float height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public float volume() {
        return length*breadth*height; 
    }
}

class Asg7A{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        float length = scanner.nextInt();
        System.out.println("Enter breadth: ");
        float breadth = scanner.nextInt();
        System.out.println("Enter height: ");
        float height = scanner.nextInt();
        Room room = new Room(length, breadth, height);
        System.out.println(" Volume: "+room.volume());
        scanner.close();
    }
}