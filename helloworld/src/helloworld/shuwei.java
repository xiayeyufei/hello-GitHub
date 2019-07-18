package helloworld;

import java.util.Scanner;

public class shuwei {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		int temp=number;
		int i,count=0;
		
		for(i=0;temp!=0;i++)
			temp/=10;
		if(number!=0)
		do {
			count*=2;
			if(((int)(number/(Math.pow(10, i-1))))%2==i%2)
				count+=1;
			number=(int) (number%(Math.pow(10, i-1)));
			i--;
		} while (i>0);
		System.out.println(count);
	}
 
}
