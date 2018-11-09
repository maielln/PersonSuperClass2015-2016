public class Instructor extends Person
{
	private String salary;

	public Instructor(String n, String b, String s)
	{
		super(n, b);
		salary = s;
	}
	public String toString()
	{
		return super.toString() + "\tSalary: " + salary;
	}
}