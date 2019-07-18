package helloworld;

import java.util.Scanner;

public class high {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int UTC = 0;
		int BJT=in.nextInt();
		if(BJT>=2359)
		{
			System.out.println("you enter a wrong number.");
		}
		else if(BJT/1000!=0)
		{
			UTC=BJT-800;
			System.out.println(UTC);
		}	
		else if(BJT/100<8)
		{
			UTC=BJT+1600;
			System.out.println(UTC);
		}
		else if(BJT/100>=8)
		{
			UTC=BJT-800;
			System.out.println(UTC);
		}
		else if(BJT/10!=0)
		{
			UTC=BJT+1600;
			System.out.println(UTC);
		}
		else if(BJT<10)
		{
			UTC=BJT+1600;
			System.out.println(UTC);
		}
		
	}
}
