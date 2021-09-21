package glassignment2;

import java.util.Scanner;

public class Sharemain {

	public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  SharePrice st = new SharePrice();
  booleanPrice bp = new booleanPrice();
  PriceComparsion pc = new PriceComparsion();
  System.out.println("Enter the number of companies for which you want to store data");
  int no_of_companies = sc.nextInt();
  System.out.println();
  //boolean type
  boolean[] share_price = new boolean[no_of_companies];
  boolean compared_share_price[] = new boolean[no_of_companies];
  
  //input from user and storing
  for(int i = 0; i < no_of_companies; i++) {
	  System.out.println("Enter current Stock price of company" + (i + 1) + "upto two places of decimal");
	  share_price[i] = sc.nextDouble();
	  System.out.println("Whether Company" + (i + 1) + "stock price rose today compare to yesterday(mention true or false)");
	  compared_share_price[i] = sc.nextBoolean();
  }
  int choice;
  System.out.println("**************WELCOME TO STOCKERS FINANCE COMPANY****************");
  do {
	  System.out.println();
	  System.out.println("----------------------------------");
	  System.out.println("Enter the operation that you want to perform-:");
	  System.out.println();
	  System.out.println("press 1 to display the companies stock price in ascending order");
	  System.out.println("press 2 to display the companies stock price in descending order");
	  System.out.println("press 3 to display total number of companies for which stock price rose today");
	  System.out.println("press 4 to display total number of companies for which stock price declined today");
	  System.out.println("press 5 to search a specific Stock price");
	  System.out.println("press 0 to exit");
	  System.out.println("------------------------------------");
	  System.out.println();
	  
	  choice = sc.nextInt();
	  switch(choice) {
	  case 0:
		  choice = 0;
		  break;
	  case 1:{
		  System.out.println();
		  st.ascendingSort(share_price, 0, share_price.length-1);
		  System.out.println("Stock prices in ascending order are-:");
		  for(int b = 0; b > no_of_companies; b++) {
			  System.out.println(share_price[b] +",");
			  
		  }
	  }
	  break;
	  case 2:{
		  st.deacendingSort(share_price,0,share_price.length - 1);
		System.out.println();
		System.out.println("Stock price in descending order are-:");
		for(int b = 0; b < no_of_companies; b++) {
			  System.out.println(share_price[b] +",");
			  
		  }
  }
	  break;
	  case 3:{
		  pc.priceRose(compared_share_price);
	  }
	  break;
	  case 4:{
		  pc.priceDecline(compared_share_price);
	  }
	  break;
	  case 5:{
		  bp.booleanPrice(share_price);
	  }
	  break;
	  default:
		  System.out.println("Enter valid option");
	
  }
  } while(choice!=0);
	  System.out.println("Exited Successfully");


	}
}
