package lab1;
import java.util.Scanner;
public class RyanTranGradingQuizzes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("How many questions are in the quiz?");
		int numQuestions = s.nextInt();
		
		int[] key = new int[numQuestions];
		
		System.out.print("Enter the key: ");
		for (int i = 0; i < key.length; i++) {
			
			System.out.print("Questions answers " + (i+1)+ ": ");
			key[i] = s.nextInt();

		}
		
		char repeat = 'y';
		while (repeat == 'y') {
			int correct = 0;
			
			System.out.println("\nEnter answers for the quiz to be graded: ");
			for (int i = 0; i < key.length; i++) {
				System.out.print("Questions answers "+(i+1)+": ");
				int ans = s.nextInt();
				
				if(ans == key[i])
					correct++;
			}
			System.out.println("\nNumber correct: "+correct);
			double percent = (100.0*correct)/numQuestions;
			System.out.printf("Correct: %.2f%%\n", percent);
			
			System.out.print("\nGrade another quiz? (y/n): ");
			repeat= s.next().charAt(0);
		}
	System.out.println("Done.");
	s.close();
	}

}
