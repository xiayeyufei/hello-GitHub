package helloworld;

import java.util.Scanner;

public class rs {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	    Scanner in = new Scanner(System.in);
		int oddNum = 0;
		int evenNum = 0;
		int digit = in.nextInt();
		while ( digit != -1 )
		{
			if( digit%2 != 0 )
			{
				oddNum++;
			}else
			{
				evenNum++;
			}
			digit = in.nextInt();
		}
		System.out.println(oddNum+" "+evenNum);
	}
}
