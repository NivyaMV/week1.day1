package week1.day1;
//Problem Statement: Fibonacci Series
public class Assignment3Fibonacci 
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int r=8;
		int sum;
		
		System.out.println("The number is " +n1);
		System.out.println("The number is " +n2);
		
		for(r=2;r<8;r++) 
		{
			sum=n1+n2;
			System.out.println("The number is " +sum);
			n1=n2;
			n2=sum;
		}
	}
}
