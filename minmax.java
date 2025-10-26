import java.util.*;
public class minmax{
    public static void main(String args[]){ // min and max in array
        Scanner sc=new Scanner(System.in);
        int n,numbers[];
        int max,min;
        System.out.println("enter size of array :");
        n=sc.nextInt();
        numbers=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element "+(i+1)+":");
            numbers[i]=sc.nextInt();

        }
       max=numbers[0];
       min=numbers[0];
       
       System.out.println(max);
        for(int i=1;i<n;i++){
           
            if(numbers[i]>max){// 1 2  3 , max=1
                max=numbers[i];
                
            }
        }
        for(int i=1;i<n;i++){
           
            if(numbers[i]<min){// 1 2  3 , min=1
                min=numbers[i];
                
            }
        }
        System.out.println("largest number in array is :"+max);
        System.out.println("smallest number in array is :"+min);
        sc.close(); 
    }
    
}
