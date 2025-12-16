import java.util.*;
class student_details
{
	Scanner sc = new Scanner(System.in);
	int sid;
	String sname,div;
	student_details()
	{
		System.out.println("----enter student details----");
		System.out.print("enter your roll no :- ");
		sid = sc.nextInt();
		System.out.print("enter your name :- ");
		sname = sc.next();
		System.out.print("enter your division :- ");
		div = sc.next();
	}
}
class marks extends student_details
{
	int java,python,dbms,yoga,rm,peace;
	marks()
	{
		System.out.print("java :- ");
		java = sc.nextInt();
		System.out.print("python :- ");
		python = sc.nextInt();
		System.out.print("dbms :- ");
		dbms = sc.nextInt();
		System.out.print("yoga :- ");
		yoga = sc.nextInt();
		System.out.print("reaserch methodology :- ");
		rm = sc.nextInt();
		System.out.print("peach :- ");
		peace = sc.nextInt();
	}
	int total = java + python + dbms + yoga + rm + peace;
	int per = total/6;
	void show()
	{
		System.out.println("----enter student details----");
		System.out.println("enter your roll no :- " + sid);
		System.out.println("enter your name :- " + sname);
		System.out.println("enter your division :- " + div);
		System.out.println("java :- " + java);
		System.out.println("python :- " + python);
		System.out.println("dbms :- " + dbms);
		System.out.println("yoga :- " + yoga);
		System.out.println("reaserch methodology :- " + rm);
		System.out.println("peach :- " + peace);
		System.out.println("total marks :- " + total);
		System.out.println("percantege :- " + per);
	}
}
public class user_ex_result
{
	public static void main(String[] args)
	{
		marks m = new marks();
		m.show();
	}
}