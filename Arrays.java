import java.util.*;
class Arrays {
    //main() method in Java is an standard method which is used by JVM to start execution of any Java program.
    // main method is referred as entry point of Java application which is true in case of core java application
    public static void main(String []args){

        // 1D array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of array : ");
        int num = sc.nextInt();
        System.out.println();
        
        int[] marks = new int[num];
        System.out.println(marks.length);
        System.out.println();
        for (int i =0 ; i<num ; i++){
            System.out.print("Enter the "+i+"th marks : ");
            marks[i] = sc.nextInt();
        }

        for(int i = 0 ; i<num ; i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        
        // 2D Arrays

        System.out.print("Enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("ENter the number of colums : ");
        int col = sc.nextInt();
        System.out.println();
        int [][] matrix = new int[rows][col];

        for (int i=0;i<rows;i++){
            for (int j =0 ; j<col ; j++){
                System.out.print("ENter the number in "+i+","+j+" location : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i=0;i<rows;i++){
            for (int j =0 ; j<col ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }    
}
