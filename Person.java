public class Person
{
	private String name;
	private String bday;

	public Person(String n, String b)
	{
		name = n;
		bday = b;
	}

	//OVERWRITE toString function
	public String toString()
	{
		return "Name: " + name + "\tBirthday: " + bday;
	}
}