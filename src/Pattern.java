/*
 * Zachary Miller
 * Assignment 4.2
 * The purpose of this program is to display a number pyramid in two different patterns 
 * 19 Sept 2017
 * Bellevue University
 * Pattern.java
 */
public class Pattern {

	
	public static void main(String[] args) {
		for(int i=1; i<=6; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int count=0;
		for(int i=6; i>0; i--)
		{
			for(int j=0;j<count;j++)
				System.out.print("\t");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
			count++;
		}
	}

}
