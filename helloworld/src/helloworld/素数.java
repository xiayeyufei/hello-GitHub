package helloworld;

import java.util.Scanner;

public class 素数 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// TODO 自动生成的方法存根
		int n=in.nextInt();
		int m=in.nextInt();
		int j=1,k=0,a=0,d=1,flag=-1;
		for(int i=1;i<=200;i++) {
			while(j<i) {
				if(i%j==0&&i!=2) {
					j=j+1;
					flag=1;
					break;
				}
				else if(i==2) {
					k=k+1;
					j=2;
					d=i;
					flag=0;
					break;
				}
				else if(i%j!=0&&j==i-1&&i!=2){
					k=k+1;
					j=2;
					d=i;
					flag=0;
					break;
				}
				else if(i%j!=0&&j<i-1&&i!=2) {
					j=j+1;
					flag=1;
				}
				
			}
			if(k>=n&&k<=m&&flag==0) {
				a=a+d;
			}
			else if(k>m) {
				break;
			}
		}
		System.out.print(a);
		System.out.print(a);
		System.out.print(a);
	}

}
