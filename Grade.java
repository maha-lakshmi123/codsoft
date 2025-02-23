import java.util.Scanner;
import java.util.*;
public class Grade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of subjects :");
		int num = sc.nextInt();
		System.out.println("Enter the obtained mark (out of 100):");
		int mark[] = new int[num];
		for(int i=0; i<num; i++)
		{
			mark[i] = sc.nextInt();
		}
		int tot = 0;
		for(int i=0; i<num; i++)
		{
			tot += mark[i];
		}
		
		float avg = (float) tot/num;
		
		System.out.println("Sum  :"+tot);
		System.out.println("Average is : " + avg);
		
		if((avg>100)||(avg<0))
		{
			System.out.println("INVALID MARK");
		}
		
		else if(avg>=90)
		{
			System.out.println("Grade is O");
			System.out.println("EXCELLENT...!!!");
		}
		else if(avg>=80)
		{
			System.out.println("Grade is A+");
			System.out.println("VERY GOOD...!!!");
		}
		else if(avg>=70)
		{
			System.out.println("Grade is A");
			System.out.println("GOOD JOB...!!!");
		}
		else if(avg>=60)
		{
			System.out.println("Grade is B+");
			System.out.println("NICE EFFORT...!!!");
		}
		else if(avg>=50)
		{
			System.out.println("Grade is B");
			System.out.println("YOU PASSED...!!!");
		}
		else
		{
			System.out.println("Grade is U");
			System.out.println("WORK HARD AND DO BETTER...!!!");
		}
	}
}
		
		
		
		
		
			
		