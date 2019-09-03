import java.util.Scanner;
public class APIQuiz
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				System.out.println("pick two words please");
				Scanner userInput = new Scanner (System.in); 
				String word1 = userInput.nextLine();
				String word2 = userInput.nextLine();
				System.out.println(word1 + word2 .toLowerCase());
			
			
			}

	}
