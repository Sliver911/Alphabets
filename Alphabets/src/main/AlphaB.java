package main;

import java.util.Scanner;


public class AlphaB {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the no of r*c ");
			int n = scan.nextInt();
			
			for(int r=1;r<=n;r++)
			{
				for(int c=1; c<=n; c++)
				{
					if(r==1 && c<(3*n)/4||r==(n/2)||c==1||r==n && c!=n
					   ||c==(3*n)/4 && r<=n/2 && r!=1|| c==n && r>=n/2)
						
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
