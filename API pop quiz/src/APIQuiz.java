import java.util.Scanner;
public class APIQuiz
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				
				Scanner userInput1 = new Scanner (System.in); 
				Scanner userInput2 = new Scanner (System.in); 
				System.out.println("pick two words please");
				String word1 = userInput1.nextLine();
				String word2 = userInput2.nextLine();
				System.out.println(word1.toLowerCase() + word2.toLowerCase()  );
				
			
			}

	}
