package glassignment2;

import java.util.Scanner;

public class booleanPrice {
  public void booleanPrice(double[] price, int low, int high) {
	  booleanPrice bp = new booleanPrice ();
	  Scanner st = new Scanner(System.in);
	  bp.booleanPrice(price,0,price.length -1);
	  System.out.println("Enter the Stock price you want to search");
	  
	  double key = st.nextDouble();
	  int low1 = 0;
	  int high1 = price.length -1;
	  int mid = (low1 + high1)/2;
	  
	  while(low1 <= high1) {
		  if(key < price[mid])
			  high1 = mid - 1;
		  else if(key == price[mid]) {
			  System.out.println("Stock of value" + key + "is present");
			  break;
			  
		  }else
			  low1 = mid + 1;
		  mid = (low1 + high1)/2;
	  }
	  if(low1 > high1) {
		  System.out.println("Stock of value" + key + "is not present");
	  }
	  
  }


	
	
}

