import java.util.*;
public class order {
    public static void main(String args[]){  // restaurant bill calculator 
        Scanner sc=new Scanner(System.in);
        String item;
        int quantity;
        float price;
        System.out.println("What would u like to order?");
        item=sc.nextLine();
        System.out.println("Quantity:");
        quantity=sc.nextInt();
        System.out.println("What is the price $ :");
        price=sc.nextFloat();

        if(quantity>1){
            price*=quantity;
            System.out.println("your order:"+item);
            System.out.println("quantity:"+quantity);
            System.out.println("total price:"+price);
        }
        else{
            System.out.println("your order:"+item);
            System.out.println("quantity:"+quantity);
            System.out.println("total price :$"+price);

        }
        sc.close();


    }
    
}
