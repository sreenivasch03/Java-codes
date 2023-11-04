class Student2
{
	public String name ;
	public int age;
	public double tenth;
	public double inter;
	public double degree;
	public double masters;
	public Student2(String name,int age,double tenth,double inter,double degree)
	{
		this.name = name;
		this.age = age;
		this.tenth = tenth;
		this.inter = inter;
		this.degree = degree;
	}
	public Student2(String name,int age,double tenth,double inter,double degree,double masters)
	{
		this(name,age,tenth,inter,degree);
		this.masters = masters;
	}
	public void studentInfo()
	{
		System.out.println("-------Student Information---------");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age+" years");
		System.out.println("Tenth  : "+tenth+"%");
		System.out.println("Inter  : "+inter+"%");
		System.out.println("Degree : "+degree+"%");
		if (masters>0)
		{
			System.out.println("Masters: "+masters+"%");
		}
	}
}
class  MainClass9
{
	public static void main(String[] args) 
	{
		Student2 student1 = new Student2("Sreenivas",22,73.1,75.14,75.9);
		Student2 student2 = new Student2("Venu",23,84.6,68.4,72.1,82.7);
		student1.studentInfo();
		student2.studentInfo();
	}
}
