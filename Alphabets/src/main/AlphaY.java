package main;

import java.util.Scanner;

public class AlphaY {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter the no of r*c ");
		int n = scan.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==r && r<=(n/2)|| c+r==n && r<=(n/2)|| c==n/2 && r>n/2)	
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
