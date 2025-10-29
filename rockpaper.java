import java.util.*;
public class rockpaper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        int num;
        num=ra.nextInt(0,3);
        String choice;
        String arr[]={"rock","paper","scissors"};
        String comp=arr[num];
        String next="yes";
        
        
        
        do{
            System.out.println("Rock paper scissors :");
            choice=sc.nextLine().toLowerCase();
            System.out.println("computer :"+comp);
            if(choice.equals("rock")&&comp.equals("scissors")){
                System.out.println("you win !");
            }
            else if(choice.equals("scissors")&&comp.equals("paper")){
                System.out.println("you win !");
            }
            else if(choice.equals("paper")&&comp.equals("rock")){
                System.out.println("you win !");
            }
            else if(choice.equals("scissors")&&comp.equals("rock")){
                System.out.println("you lose ! ");
            }
            else if(choice.equals("rock")&&comp.equals("paper")){
                System.out.println("you loose !");
            }
            else if(choice.equals("paper")&&comp.equals("scissors")){
                System.out.println("you loose");
            }
            else if(choice.equals("rock")&&comp.equals("rock")||
            choice.equals("paper")&&comp.equals("paper")||
            choice.equals("scissors")&&comp.equals("scissors")){
                System.out.println("tie");
            }
            else{
                System.out.println("invalid input ");
            }
           
            System.out.println("do u want to continue ? (yes / no) ");
            next=sc.nextLine().toLowerCase();
            

        }
        while(next.equals("yes"));
        sc.close(); 

    } 
    
}
