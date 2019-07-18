package helloworld;


class Stu 
{
	String name;
	double GPA;
	Course list[] = new Course[30];

	void enroll()
	{
		list[0].enroll(this);
	}

	void init()
	{
		list[0]=new Course();
		list[1]=new Course();
		list[0].name="Java";
		list[1].name="Math";
	}

	void study(Course c)
	{
		c.score++;
		//System.out.print(c.name+" : "+list[0].name);
		for (int i = 0 ; i < 2 ; i++ )
		{
			if(c.name == list[i].name)
			//if (c.name.equals(list[i].name))
			{
				list[i]=c;
			}
		}
	}

	void printInfor()
	{
		System.out.println("学生"+name+"的"+list[0].name+"是"+list[0].score+"分");
	}
}

