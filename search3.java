import java.util.*;
public class search3 { //search in String array from user input
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        String languages[];
        System.out.println("enter the size of array :");
        n=sc.nextInt();
        languages=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter element "+(i+1)+":");
            languages[i]=sc.nextLine();
        }
        String ele;
        System.out.println("enter element to be searched :");
        ele=sc.nextLine();

        


        for(int i=0;i<n;i++){
            if(languages[i].equals(ele)){
                System.out.println("element is found at index :"+i);
                System.out.println("element is :"+languages[i]);
                break;
            }
          
        }
         
        
        sc.close();



    }
    
}
