package methods_printsmallvalue;

import java.util.Scanner;

 // With argument & return type
public class Args_returntype {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first no");
        double x=in.nextInt();
		System.out.println("Enter 2nd no");
		double y=in.nextInt();
		System.out.println("Enter 3rd no");
		double z=in.nextInt();
		System.out.println("Average of numbers are " + ave(x,y,z)+"\n");
		
	}
	
	public static double ave(double x,double y,double z)
	{
	double res;
	return res = (x+y+z)/3;	
	
	}
	
	
	
	
	
	

}
