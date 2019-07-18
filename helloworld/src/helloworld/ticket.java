package helloworld;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in =new Scanner(System.in);
		int total=0;
//			读入投币金额
		while(true)
		{
			
			System.out.print("请投币");
			int amount=in.nextInt();
			total=(amount+total);
			if (total>=10)
			{
				//打印车票
				System.out.println("****************");
				System.out.println("javalalallaal");
				System.out.println("no seat");
				System.out.println("price:ten yuan");
				System.out.println("****************");
				//计算并找零
				System.out.println("找零："+(total-10));
				total=0;
			}
		
		}

	}
}