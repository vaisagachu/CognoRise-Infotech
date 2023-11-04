package cognirise_infotech;
import java.util.*;
public class HangmanGame 
{
	public static char findword[];
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String word[] = {"Carrot","Cauliflower","Tomato","Beans","Brinjal","Onion","Cucumber","Broccoli","Potato"};
		int chances = 5;
		String guessword = word[rd.nextInt(word.length)];
		findword= new char[guessword.length()];
		Arrays.fill(findword,'-');
		System.out.println("Try to Guess any vegetable name");
		System.out.println("Guess the word :  "+Arrays.toString(findword));
		System.out.println();
		System.out.println("You totally got 5 chances to guess the word. Your chances will only reduce when you guess the wrong letter...");
		System.out.println();
		System.out.println("Let's Start the Game!");
		boolean win = false;
		while(chances>0 && !win)
		{
			System.out.println("Guess word : "+toString(findword));
			System.out.println("Chances left : "+chances);
			System.out.println();
			System.out.println("Enter the guessing letter : ");
			char letter = Character.toLowerCase(sc.next().charAt(0));
			if(!check(guessword.toLowerCase(),letter)) chances--;
			if((guessword.toLowerCase()).equals(toString(findword))) win = true;
		}
		if(win) System.out.println("Congratulations! You have won the game and guessed the name "+" ' "+guessword+" ' ");
		else System.out.println("Oops! You missed the chances and failed to find the word name - "+" ' "+guessword+" ' ");
	}
	public static String toString(char a[])
	{
		String s = new String(a);
		return s;
	}
	static boolean check(String s, char c)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c) 
			{
				findword[i]=c;
				count =1;
			}
		}
		if(count==1) return true;
		return false;
	}
}
