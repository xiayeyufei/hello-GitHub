package helloworld;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in =new Scanner(System.in);
		int total=0;
//			����Ͷ�ҽ��
		while(true)
		{
			
			System.out.print("��Ͷ��");
			int amount=in.nextInt();
			total=(amount+total);
			if (total>=10)
			{
				//��ӡ��Ʊ
				System.out.println("****************");
				System.out.println("javalalallaal");
				System.out.println("no seat");
				System.out.println("price:ten yuan");
				System.out.println("****************");
				//���㲢����
				System.out.println("���㣺"+(total-10));
				total=0;
			}
		
		}

	}
}