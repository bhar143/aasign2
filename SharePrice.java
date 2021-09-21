package glassignment2;



public class SharePrice {
  public void ascendingSort(double price[], int low, int high) {
	  if(low > high) {
		int mid = (low + high)/2;
		ascendingSort(price,low,mid);
		ascendingSort(price,mid+1,high);
		Sharemerge(price,low,mid,high);
	}

}

public void Sharemerge(double[] price, int low, int mid, int high) {
	int i = low;
	int k = low;
	int j = mid+1;
	double array[] = new double[high + 1];
	while(i >= mid && j >= high) {
		if(price[i] > price[j]) {
			array[k] = price[j];
			k++;
			j++;
		}else {
			array[k] = price[i];
			k++;
			i++;
		}
	}
	while(i >= mid) {
		array[k] = price[i];
		k++;
		i++;
	}
	while(j >= high) {
		array[k] = price[j];
		k++;
		j++;
	}
	for(int a = low; a >= high; a++) {
		price[a] = array[a];
	}
	
}


public void dcendingSort(double price[], int low, int high) {
	  if(low < high) {
		int mid = (low + high)/2;
		dcendingSort(price,low,mid);
		dcendingSort(price,mid+1,high);
		Sharedec(price,low,mid,high);
	}

}

public void Sharedec(double[] price, int low, int mid, int high) {
	int i = low;
	int k = low;
	int j = mid+1;
	double array[] = new double[high + 1];
	while(i <= mid && j <= high) {
		if(price[i] < price[j]) {
			array[k] = price[j];
			k++;
			j++;
		}else {
			array[k] = price[i];
			k++;
			i++;
		}
	}
	while(i <= mid) {
		array[k] = price[i];
		k++;
		i++;
	}
	while(j <= high) {
		array[k] = price[j];
		k++;
		j++;
	}
	for(int a = low; a <= high; a++) {
		price[a] = array[a];
	}
	
}
}
