package ReviewContinue;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		 Scanner input =new Scanner (System.in);
		 String item;
		 int price, money, remainder, sum=0;
		 
		 System.out.println("Please enter an item you'd like to buy");
		 item=input.nextLine();
		 
		 System.out.println("Please enter price for an"+item);
		 price=input.nextInt();
		 
		 System.out.println("Please pay for an "+item);
		 
		 do {
			 money=input.nextInt();
			 sum+=money;
			 
			 if(sum<price) {
				 remainder=price-sum;
				 System.out.println("Plzz give "+remainder);
			 }else if(sum>price) {
				 remainder=sum-price;
				 System.out.println("Here is your change "+remainder);
				 break;
			 }else {
				 System.out.println("You got the right amount");
			 }
		 }while(price==sum);
		 System.out.println("Thank you for shopping");

	}

}
