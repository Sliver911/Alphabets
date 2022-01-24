package alphabetsGenerator;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name here: ");
		String s = sc.nextLine();
		
		System.out.println("Enter your desired font size: ");
		int n = sc.nextInt();
		
		s = s.toUpperCase();
		
		for(int k=0; k<s.length(); k++)
		{
			char ch = s.charAt(k);
			if(ch=='A'|| ch=='a')
				//code for A
			    for(int r=1; r<=n; r++)
		    {
				for(int c=1; c<=n; c++)
				{
					if(c==1 && r>n/2|| c==n && r>n/2||
					   r==n/2|| r+c==(n/2)+1 || c-r==n/2)
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
			
			    if(ch=='B'|| ch=='b')
				//code for B
			    for(int r=1; r<=n; r++)
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
			    
			    if(ch=='C'|| ch=='c')
					//code for C
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1||c==1||r==n)
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
			    
			    if(ch=='D'|| ch=='d')
					//code for D
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c<(2*n)/3||c==1||r==n && c<=(2*n)/3
								   ||c==(3*n)/4 && r!=1)
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
			    
			    if(ch=='E'|| ch=='e')
					//code for E
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1||c==1||r==n|| r==n/2)
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
			    
			    if(ch=='F'|| ch=='f')
					//code for F
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c<=n/n||c==1|| r==1|| r==n/2)
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
			    
			    if(ch=='G'|| ch=='g')
					//code for G
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c<=(3*n)/4||c==1||r==n && c!=n
								   ||c==(3*n)/4 && r==(n/2) && r!=1|| c==n && r>=n/2)
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
			    
			    if(ch=='H'|| ch=='h')
					//code for H
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c<=n/n||c==1||r==n/2||c==n)
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
			    
			    if(ch=='I'|| ch=='i')
					//code for I
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1||r!=n && c == n/2||r==n && c== n/2 || r==n)
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
			    
			    if(ch=='J'|| ch=='j')
					//code for J
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1||r!=n && c == n/2||r==n && c== n/2 
						   || c==1 && r>=(3*n)/4 || r==n && c<=n/2)
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
			    
			    if(ch=='K'|| ch=='k')
					//code for K
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==1|| r-c==(n/2)|| r+c==(3*n)/4)
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
			    
			    if(ch=='L'|| ch=='l')
					//code for L
				    for(int r=1; r<=n; r++)
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
			    
			    if(ch=='M'|| ch=='m')
					//code for M
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==1|| c==n|| c==r && r<=(n/2)
						   || c+r==n+1 && r<=(n/2))
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
			    
			    if(ch=='N'|| ch=='n')
					//code for N
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==1|| c==n|| c==r)
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
			    
			    if(ch=='O'|| ch=='o')
					//code for O
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c<(3*n)/4|| r==(3*n)/4&& c<=(3*n)/4||
						   c==1 && r<=(3*n)/4|| c==(3*n)/4 && r<=(3*n)/4)	 
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
			    
			    if(ch=='P'|| ch=='p')
					//code for P
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c==1||c==1|| r==n/2|| r==1||c==n && r<=n/2)
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
			    
			    if(ch=='Q'|| ch=='q')
					//code for Q
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c<(3*n)/4|| r==(3*n)/4&& c<=(3*n)/4||
						   c==1 && r<=(3*n)/4|| c==(3*n)/4 && r<=(3*n)/4		
						   ||r==c&&r>=n/2)   	 
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
			    
			    if(ch=='R'|| ch=='r')
					//code for R
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c==1||c==1|| r==n/2|| r==1
						   ||c==n && r<=n/2|| c==r)
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
			    
			    if(ch=='S'|| ch=='s')
					//code for S
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1 && c>(n/n)+1||c==r && c!=1 || r==n)
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
			    
			    if(ch=='T'|| ch=='t')
					//code for T
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(r==1||r!=n && c == n/2||r==n && c== n/2)
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
			    
			    if(ch=='U'|| ch=='u')
					//code for U
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==1|| c==n|| r==n)
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
			 
			    
			    if(ch=='V'|| ch=='v')
					//code for V
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==r && r<=(n/2)|| c+r==n && r<=n/2)	
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
			    
			    if(ch=='W'|| ch=='w')
					//code for W
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==1|| c==n|| c==r && r>=(n/2)|| 
						   c+r==n+1 && r>=(n/2))	
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
			    
			    if(ch=='X'|| ch=='x')
					//code for X
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==r ||c== n-r+1)
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
			    
			    if(ch=='Y'|| ch=='y')
					//code for Y
				    for(int r=1; r<=n; r++)
			    {
					for(int c=1; c<=n; c++)
					{
						if(c==r && r<=(n/2)|| c+r==n && r<=(n/2)
						   || c==n/2 && r>n/2)	
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
			    
			    if(ch=='Z'|| ch=='z')
					//code for Z
				    for(int r=1; r<=n; r++)
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
}




						