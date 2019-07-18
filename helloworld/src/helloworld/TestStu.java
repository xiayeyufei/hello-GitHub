package helloworld;

class TestStu 
{
	public static void main(String[] args) 
	{
		Course c = new Course();
		c.name = "Java";

		Stu stu = new Stu();
		stu.name = "ÍõĞ¡Ã÷";
		stu.init();

		for (int i = 0 ; i < 30 ; i++ )
		{
			stu.study(c);
		}
		stu.printInfor();
	}
}
