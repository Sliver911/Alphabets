package main;

import java.util.Scanner;


public class AlphaL {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the no of r*c ");
			int n = scan.nextInt();
			
			for(int r=1;r<=n;r++)
			{
				for(int c=1; c<=n; c++)
				{
					if(r==1 && c<=n/n||c==1||r==n && c!=n)
						
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
