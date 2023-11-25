import java.util.*;

class Name{
    String first , middle , last;
    Name(String first , String middle , String last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
}

class DOB{
    int DD,MM,YY;
    DOB(int DD, int MM, int YY){
        this.DD = DD;
        this.MM = MM;
        this.YY = YY;
    }
}

class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String gender;
    int [] marks = new int[3];
    Name n;
    DOB b;
    Student(int id, String gender, String first , String middle , String last , int DD, int MM , int YY){
        this.id = id;
        this.gender = gender;
        this.n = new Name(first, middle, last);
        this.b = new DOB(DD, MM, YY);
        System.out.println("Enter marks of English math and CS : ");
        for(int i = 0; i < 3; i++){
            marks[i] = sc.nextInt();
        }
    }

    public void Display(){
        System.out.println("ID : "+ id);
        System.out.println("Gender : "+ gender);
        System.out.println("Name : "+ n.first+" "+ n.middle+" "+ n.last);
        System.out.println("DOB : "+ b.DD+"/"+ b.MM+"/"+ b.YY);
        System.out.println("English marks : "+ marks[0]);
        System.out.println("Math marks : "+ marks[1]);
        System.out.println("CS marks : "+ marks[2]);
    }
}

class Asg7d {
    static void search(int n,Student arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of student u want to search for : ");
        int i;
        int se = sc.nextInt();
        for(i=0;i<=n;i++){
            if (arr[i].id ==se){
                arr[i].Display();
                break;
            }
        }
        if (i==n){
            System.out.println("Student not in database");
        }
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i=0;i<n;i++){
            System.out.println("ENter Student ID : ");
            int id = sc.nextInt();
            System.out.println("ENter student Gender :");
            String gender = sc.next();
            System.out.println("Enter first name : ");
            String first = sc.next();
            System.out.println("Enter middle name : ");
            String middle = sc.next();
            System.out.println("Enter last name : ");
            String last = sc.next();
            System.out.println("ENter day of birth : ");
            int DD = sc.nextInt();
            System.out.println("ENter month of birth : ");
            int MM = sc.nextInt();
            System.out.println("ENter year of birth : ");
            int YY = sc.nextInt();
            arr[i] = new Student(id, gender, first, middle, last, DD, MM, YY);
            System.out.println("Database is : -------");
            arr[i].Display();
        }
        search(n,arr);
        sc.close();
    }
}
