import java.util.Scanner;

public class persontester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a person's name. ");
		String name = in.nextLine();

		System.out.print("Enter a person's birthday. ");
		String bday = in.nextLine();

		Person p = new Person(name, bday);

		System.out.print("Enter a student's name. ");
		String sname = in.nextLine();

		System.out.print("Enter a student's birthday. ");
		String sbday = in.nextLine();

		System.out.print("Enter a student's major. ");
		String major = in.nextLine();

		Student s = new Student(sname, sbday, major);

		System.out.print("Enter an instructor's name. ");
		String iname = in.nextLine();

		System.out.print("Enter an instructor's birthday. ");
		String ibday = in.nextLine();

		System.out.print("Enter an instructor's salary. ");
		String salary = in.nextLine();

		Instructor i = new Instructor(iname, ibday, salary);

		System.out.println();
		System.out.println("Person -->" + p);
		System.out.println("Student -->" + s);
		System.out.println("Instructor -->" + i);
	}
}