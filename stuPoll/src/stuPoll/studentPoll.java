package stuPoll;


public class studentPoll {

	public static void main(String[] args) {
		
		
		int[] responses = {1, 2, 3, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		
		int[] frequency = new int[9];
		
		for (int anwser = 0; anwser < responses.length; anwser++){
			
			try {
				++frequency[responses[anwser]];
				System.out.println(responses[anwser]);
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf("responses[%d] = %d\n\n", anwser, responses[anwser]);
			}
			}
		
		for (int rating = 1; rating < frequency.length; rating++){
			System.out.printf("responses[%d] = %d\n\n", rating, frequency[rating]);
			
		}
		}
	
}
	
