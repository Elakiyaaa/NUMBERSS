package loop;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE NUMBER:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		for(int i=0;i<=n;i++)
		{
		temp=temp+i;
		}
		System.out.println("SUM OF NUMBER "+temp);
	}

}
