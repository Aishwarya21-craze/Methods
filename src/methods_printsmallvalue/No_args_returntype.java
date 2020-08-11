/**
 * 
 */
package methods_printsmallvalue;

import java.util.Scanner;

// Methods without argument & return type

public class No_args_returntype {

	static int first, second, third;

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner input1 = new Scanner(System.in);
		first = Integer.parseInt(input1.nextLine());
		
		System.out.println("enter second number");
		Scanner input2 = new Scanner(System.in);
		second = Integer.parseInt(input2.nextLine());
		
		System.out.println("enter third number");
		Scanner input3 = new Scanner(System.in);
		third = Integer.parseInt(input3.nextLine());
		
		//Scanner input4= new Scanner(System.in);
		//System.out.println("enter fourth number");
		//fourth = Integer.parseInt(s)

		No_args_returntype small = new No_args_returntype();
		small.findsmall();
	}

	public int findsmall() {

		if (first < second) {
			System.out.println("The smallest number is " + ":" + first);
			return first;

		} else if (first < third) {

			System.out.println("The smallest number is " + ":" + second);
			return second;
		}

		else {
			System.out.println("The smallest number is " + ":" + third);
			return third;

		}
	}
}
