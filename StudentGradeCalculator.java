package codesoft;
import java.util.*;
public class StudentGradeCalculator 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Subjects you want to calculate : ");
		int n = sc.nextInt();
		int tot = 0;
		System.out.println();
		System.out.println("Enter the marks obtained for each subjects out of 100 ");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter marks for Subject "+(i));
			tot += sc.nextInt();
			System.out.println();
		}
		int percentage = tot/n;
		String grade;
		if(percentage>=90 && percentage<=100) grade = "O -> (Outstanding)";
		else if(percentage>=80 && percentage<90) grade = "A+ -> (Excellent)";
		else if(percentage>=70 && percentage<80) grade = "A -> (Good)";
		else if(percentage>=60 && percentage<70) grade = "B+ -> (Average)";
		else if(percentage>=50 && percentage<60) grade = "B -> (Need Improvement)";
		else grade = "F -> Fail";
		System.out.println("Your Total Marks Out of "+(n*100)+" : "+tot);
		System.out.println("Your Average Percentage(%)  : "+percentage+"%");
		System.out.println("Your Total Grade Obtained   : "+grade);
	}
}
