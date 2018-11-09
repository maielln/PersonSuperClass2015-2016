public class Student extends Person
{
	private String major;

	public Student(String n, String b, String m)
	{
		super(n, b);
		major = m;
	}
	public String toString()
	{
		return super.toString() + "\tMajor: " + major;
	}
}