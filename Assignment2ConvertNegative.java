package week1.day1;

public class Assignment2ConvertNegative {

	public static void main(String[] args) {
		int numb=-12;
		int n;
		if(numb<0)
		{
			n=numb*-1;
			System.out.println(numb + " is converted to a Positive number " +n);
		}
		else if(numb>0) {
			System.out.println("Given number is a Positive number");
		}
	}

}
