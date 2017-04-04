package initArray;

public class initArray {

	public static void main(String[] args) {
		
		int[] array;
		array = new int[10];
		
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d\n", counter, array[counter]);
		}	
		
		int[] array2 = {32, 27, 64, 18, 95, 114, 90, 70, 60, 37};
		System.out.printf("\n%5s%8s\n", "Index", "Value");
		
		for(int counter = 0; counter < array2.length; counter++) {
		System.out.printf("%5d%8d\n", counter, array2[counter]);
		}
		
		
		final int ARRAY_LENGTH = 10;
		int[] array3 = new int[ARRAY_LENGTH];
		
		
		System.out.printf("\n%5s%8s\n", "Index", "Value");
		for (int counter = 0; counter < array3.length; counter++){
			array3[counter] = 2 + 2 * counter;
			
			System.out.printf("\n%5d%8d", counter, array3[counter]);
		}
		
	}	
}
