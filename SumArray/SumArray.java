package sumArray;

public class SumArray {

	
	public static void main(String[] args) {
	
	arrSum();
	
}


	public static void arrSum() {
		
		int[] arr = {34, 54, 34, 87, 23, 97, 23, 74, 75, 23};
		int total = 0;
	
	for(int counter = 0; counter < arr.length; counter++) {
		total += arr[counter];
		System.out.printf("\n%d", total);
	}
	}
	
	
	
	
}