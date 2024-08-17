
import java.util.Scanner;

class FactorialRecursion
{
	static int num;
	static int fact = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num = sc.nextInt();

		factorial();
		System.out.println("Factorial : " +fact);
	}

	public static void factorial()
	{

		fact *= num;

		num--;
       
        if(num==0)
        	return;
        factorial();

	}
}

