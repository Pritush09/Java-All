import java.util.*;
class BasicSorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter the elements : ");
        for(int i =0 ; i<num;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        int temp;
        sc.close();
        // bubble sort 
        for (int i =0 ; i<num ;i++){
            for (int j=0; j<num-i-1;j++){
                if (arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("The sorted array is : ");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int a[]  = {4,3,26,7,8,1};
        int j;
        int x;
        // INsertion sort 
        for (int i=1;i<a.length;i++){
            j = i-1;
            x = a[i];
            while(j>=0 && x<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=x;

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}