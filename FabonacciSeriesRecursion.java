

import java.util.Scanner;

class FabonacciSeriesRecursion
{
	//static int num1 = 0;
  	//static int num2 = 1;
  	static int i = 1;

  public static void main(String[] args) {

  	fabonacciSeries();
  	//System.out.print(num1 + " " + num2 + " ");
  }

  public static void fabonacciSeries()
  {

  	int num1 = 0;
  	int num2 = 1;

  	System.out.print(num1 + " " + num2 + " ");

  	//i++;
  	
  	int op = num1 + num2;
  		System.out.print(op+ " ");

  		i++;

  		num1 = num2;
  		num2 = op;

  		//i++;

  		if(i>8)
  			return;

  		fabonacciSeries();
  	}

  }















