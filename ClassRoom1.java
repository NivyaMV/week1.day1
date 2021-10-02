package week1.day1;

public class ClassRoom1 {

	public static void main(String[] args) {
		int numb=25;
		if (numb%3==0 && numb %5==0)
		{

			System.out.println("TRIZZ-FIZZ");
		}
		
		else if(numb%5==0)
		{

			System.out.println("FIZZ");
		}
		else if(numb%3==0)
		{

			System.out.println("TRIZZ");
		}
		else
		{System.out.println("Not divisible by both");
		}
	}
}


