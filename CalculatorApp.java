package cognirise_infotech;
import java.util.*;
public class CalculatorApp 
{
		public static void main(String[] args) 
		{
				Scanner sc = new Scanner(System.in);
				try
				{
						System.out.println("Enter number 1 : ");
						double n1  = sc.nextDouble();
						System.out.println("Enter number 2 : ");
						double n2 = sc.nextDouble();
						System.out.println("Enter any of the operator given below for the number calculations..");
						System.out.println(" [ + , - , * , / ] ");
						char c = sc.next().charAt(0);
						double ans;
						if(c == '+')
						{
							 ans = n1 + n2;
							 System.out.println("Answer is :   "+(int) ans);
						}
						else if(c == '-')
						{
							 ans = n1 - n2;
							 System.out.println("Answer is :   "+(int) ans);
						}
						else if(c == '*')
						{
							 ans = n1 * n2;
							 System.out.println("Answer is :   "+ans);
						}
						else if(c == '/')
						{
								if(n2 == 0) throw new ArithmeticException("You cannot able to divide any number by zero... Please check it out!");
								ans = n1/n2;
								System.out.println("Answer is :   "+ans);
						}
						else	throw new IllegalArgumentException("Please check the operator you have given! ");
				}
				catch(Exception e)
				{
						System.out.println("Oops! Error  :( ");
						System.out.println(e.getMessage());
				}
		}
}
