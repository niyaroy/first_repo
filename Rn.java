import java.util.Scanner;
import java.util.regex.*;
class Rn
{
	String fname;
	String lname;
	String phno;
	String address;
	String pwd;
	String eml;
	
	Rn(String fname,String lname,String phno,String eml,String pwd,String address)
	{
		this.fname=fname;
		this.lname=lname;
		this.phno=phno;
		this.eml=eml;
		this.pwd=pwd;
		this.address=address;
		
	}
	public static boolean isValid(String phno){
		
	Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
	Matcher m 	= p.matcher(phno);
	return (m.find() && m.group().equals(phno));
}

	public static void main(String args[])
	{
		String fname;
		String lname;
		String phno;
		String eml;
		String pwd;
		String address;
		Scanner sc=new Scanner(System.in);
		System.out.println("Register here...");
		System.out.println("Enter your first name");
		fname=sc.nextLine();
		System.out.println("Enter ur last name");
		lname=sc.nextLine();
		System.out.println("Enter your phone number");
		phno=sc.nextLine();
		System.out.println("Enter your Email id");
		eml=sc.nextLine();
		System.out.println("Enter your pwd");
		pwd=sc.nextLine();
		System.out.println("Enter your address");
		address=sc.nextLine();
		Rn br= new Rn(fname,lname,phno,eml,pwd,address);
		if (isValid(phno))
		{
			System.out.println("Successfully Registered");
			System.out.println("\n Treatments available\n");
		String[] treatment={"1.Root Cannal","2.Gum Disease","3.Teath problem","4.Teath clipping"};
	for (String i : treatment)
	{
	System.out.println(i);
	}


		}
		else
		{
			System.out.println("Please enter a Valid number");
	}
		
		


	}
}


