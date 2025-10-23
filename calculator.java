import java.util.*;
public class calculator { //simple calculator using normal switch
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char operator;
        float a,b,c;
        System.out.println("enter value of A :");
        a=sc.nextFloat();
        System.out.println("enter value of B:");
        b=sc.nextFloat();
        System.out.println("enter an Operator (+,-,*,/)");
        operator=sc.next().charAt(0);
        switch(operator){
            case '+': 
            c=a+b;
            System.out.println("sum = "+c);
            break;
            case '-':
            c=a-b;
            System.out.println("diff = "+c);
            break;
            case '*':
            c=a*b;
            System.out.println("product = "+c);
            break;
            case'/':
            if(b<=0){
                System.out.println("division by zero error !");
                break;
            }
            else{
                c=a/b;
                System.out.println("division = "+c);
                break;
            }
            default:
            System.out.println("invalid operator");
            break;
        }
        sc.close();



        






    }
    
    
}
