import java.util.*;
public class madlib { // madlib game
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String verb,noun,adjective;
        System.out.println("enter a verb (already done)");
        verb=sc.nextLine();
        System.out.println("enter a noun:");
        noun=sc.nextLine();
        System.out.println("enter an adjective:");
        adjective=sc.nextLine();
        System.out.println("");
        System.out.println("i "+verb+" this morning");
        System.out.println("i went to "+noun);
        System.out.println("i was "+adjective);
        sc.close();


    }
    
}
