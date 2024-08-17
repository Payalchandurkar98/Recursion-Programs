

class MethodRecursion1
{
	static int number = 1;
	public static void main(String[] args) {

		printNumbers();
		
	}

	public static void printNumbers()
	{
		System.out.print(number+ " ");
		//if(number==10)

		number++;

		if(number>10)
			return;

		printNumbers();
    }
}  


/*class MethodRecursion1
{
	static int i = 1;
	public static void main(String[] args) {

		m1();
		
	}

	public static void m1()
	{
		if(i>5)
		{
			return;
		}
		i++;
		m1();
	}
}     */