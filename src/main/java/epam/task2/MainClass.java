package epam.task2;

import java.util.Scanner;

public class MainClass {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Number of Chocolates=");
		int choc1=sc.nextInt();
		System.out.println("Number of Sweets=");
		int sweets1=sc.nextInt();
		int[] choc=new int[choc1];
		int[] sweets=new int[sweets1];
		for(int i=0;i<choc1;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" chococlates");
			choc[i]=sc.nextInt();
		}
		Chocolates c1=new Chocolates();
		int chocweight=c1.total_weight(choc, choc1);
		for(int i=0;i<sweets1;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" Sweets");
			sweets[i]=sc.nextInt();
		}
		Sweets s1=new Sweets();
		int sweetweight=c1.total_weight(sweets, sweets1);
		System.out.print("Enter the lowest weight range of candy:");
		int low=sc.nextInt();
		System.out.print("Enter the highest range of the candy:");
		int high=sc.nextInt();
		int num_of_chococandy=c1.num_of_candy(low,high,choc,choc1);
		int num_of_sweetcandy=s1.num_of_candy(low,high,sweets,sweets1);
		int total_candy=num_of_chococandy+num_of_sweetcandy;
		if(total_candy>=1)
			System.out.print("***Congratulations you recieved "+total_candy+" candy***");
		else
			System.out.print("You recieved "+total_candy+" candy");
		
		
	}


}
