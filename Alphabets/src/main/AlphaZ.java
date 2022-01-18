package main;

import java.util.Scanner;

public class AlphaZ {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter the no of r*c ");
		int n = scan.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 ||c==(n-r)+1|| r==n)
					   {
					System.out.print("*");
					   }
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		
		}
	}
}