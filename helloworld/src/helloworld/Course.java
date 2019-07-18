package helloworld;

class Course 
{
	String name;
	int number;
	int hour;
	String instructor;
	int score;

	Stu stu[] = new Stu[100];

	void enroll(Stu temp)
	{
		stu[0] = temp;
	}

	
}
