

import java.util.Scanner;

class FactorsRecursion
{
	static int num;
	static int i = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num = sc.nextInt();

		factors();
		//System.out.println(i+ " ");
	}

	public static void factors()
	{
		i++;

		if(num%i==0)
		{
			System.out.print(i+ " ");
		}

		if(i==num)
			return;

		factors();
	}
}









