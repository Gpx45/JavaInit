

public class arrCon {


	public static void main(String[] args) {
	int[] array = {2, 9, 10, 0, 4, 6, 1, 3, 4, 8, 1};

	System.out.println("Grade Distro:");

	for (int counter = 0; counter < array.length; counter++){

		if (counter == 10) {
			System.out.printf("%5d: ", 100);
		}
		else {
			System.out.printf("%02d-%02d: ",
					counter * 10, counter * 10 + 9);
		}

		for (int stars = 0; stars < array[counter]; stars++) {
		System.out.printf("*");
		}

		System.out.println();
	}
	}
}
