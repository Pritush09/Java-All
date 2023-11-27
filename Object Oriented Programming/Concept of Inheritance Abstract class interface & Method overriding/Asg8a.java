import java.util.*;

class Employee{
    int EID;
    String name,city;
    double basic;
    public void get_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        EID = sc.nextInt();
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter City : ");
        city = sc.next();
        System.out.println("Enter basic Salary : ");
        basic  = sc.nextDouble();
        // sc.nextLine();
        // sc.close();
    }
    public void Display(){
        System.out.println("Employee ID : "+EID);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee City : "+city);
        System.out.println("Employee Salary : "+ Salary(basic));
    }

    public double Salary(double basic){
        return basic;
    }
}

class Company1 extends Employee{
    @Override
    public double Salary(double basic){
        double AGP = 0.4*basic;
        double merged_basic = basic+AGP;
        double DA = 0.25*merged_basic;
        double HRA = 0.1*merged_basic;
        return (AGP+DA+HRA+basic);
    }
}

class Company2 extends Employee{
    @Override
    public double Salary(double basic){
        double AGP = 0.5*basic;
        double merged_basic = basic+AGP;
        double DA = 0.5*merged_basic;
        double HRA = 0.15*merged_basic;
        return (AGP+DA+HRA+basic);
    }
}

/**
 * Asg8a
 */
public class Asg8a {
    public static void main(String[] args) {
        Company1 emp1 = new Company1();
        Company2 emp2 = new Company2();
        System.out.println("Enter the details of employee1 (Company 1)");
        emp1.get_details();
        // System.out.println(" ");
        System.out.println("Enter the details of employee2 (Company 2)");
        emp2.get_details();

        emp1.Display();
        emp2.Display();
    }
}

// However, there is a small issue in the get_details method of the Employee class. You are closing the Scanner object (sc) inside the method.
//  It's generally not recommended to close the Scanner if you are reading from System.in because it closes the underlying input stream.
//   When you close it,you won't be able to read input from 
// the console later in your program. It's better to close the Scanner when you no longer need it, typically at the end of your program.

// Additionally, if you want to handle closing the Scanner more elegantly, you can use the try-with-resources statement. 
// This ensures that each resource is closed at the end of the statement: