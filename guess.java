import java.util.*;
public class guess {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        int guess,num;
        int total=0;
        num=ra.nextInt(1,100);

        do{
            System.out.println("enter a guess btw 1-100");
            guess=sc.nextInt();
            total+=1;
            if(guess<num){
                System.out.println("too low ");
            }
            else if(guess>num){
                System.out.println("too high ");
            }
            else{
                System.out.println("correct guess !");
                System.out.println("random number :"+num);
                System.out.println("total attempts :"+total);

            }
        }
        while(guess!=num);
        sc.close();
        
        

        
    }
    
}
