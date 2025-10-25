import java.util.*;
public class search2{ // search in int array from user input
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int numbers[];
        System.out.println("enter size of array :");
        n=sc.nextInt();
        numbers= new int[n];

        for (int i=0;i<n;i++){
            System.out.println("enter element "+(i+1)+":");
            numbers[i]=sc.nextInt();
          
        }
        int m;
        System.out.println("enter element to be searched :");
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(m==numbers[i]){
                System.out.println("element is found at index :"+i);
                break;

            }
           
        }




        sc.close();

    }
}