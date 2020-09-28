import java.util.Scanner;
import java.io.*;
class doctor
{
    String did, dname, specilist, appoint, doc_qual;
	int droom;     
	void doctor_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t\t" + appoint + "     \t" + doc_qual + "       \t" + droom);
    }
}
public class Rn3
{
	String fname;
	String lname;
	String phno;
	String address;
	String pwd;
	String eml;
	
	Rn3(String fname,String lname,String phno,String eml,String pwd,String address)
	{
		this.fname=fname;
		this.lname=lname;
		this.phno=phno;
		this.eml=eml;
		this.pwd=pwd;
		this.address=address;
		
	}

	public static void main(String args[])
	{
		String fname;
		String lname;
		String phno;
		String eml;
		String pwd;
		String address;
		int i;
		int j=0;
		int choice;
		int count1=3;
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
		doctor[] d = new doctor[25];
	for (i = 0; i < 25; i++)
        d[i] = new doctor();
	   d[0].did = "21";
        d[0].dname = "Dr.Alex";
        d[0].specilist = "pedodontics";
        d[0].appoint = "10-11AM";
        d[0].doc_qual = "MDS";
        d[0].droom = 17;
        d[1].did = "32";
        d[1].dname = "Dr.Amal";
        d[1].specilist = "prosthodontics";
        d[1].appoint = "11-12AM";
        d[1].doc_qual = "MDS";
        d[1].droom = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Orthodonics";
        d[2].appoint = "1-2PM";
        d[2].doc_qual = "MDS";
        d[2].droom = 8;
	   
	  		
		System.out.println("Successfully Registered");
		System.out.println("\n Treatments available\n");
		String[] treatment={"1.Root Cannal","2.Gum Disease","3.Teath problem","4.Teath clipping"};
	for (String k : treatment)
	{
	System.out.println(k);
	}
	
	choice = sc.nextInt();
	switch(choice)
	{
	case 1:
{
	 System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t\tSpecilist  \t\t\tTiming \t \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
 for (j = 0; j < count1;j++)
 {
       d[j].doctor_info();
 }   
break;                             
}
	case 2:
{
System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t \t Specilist \t\t \tTiming \t \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
 for (j = 0; j < count1;j++)
 {
       d[j].doctor_info();
 }   
break;                             

	
	}
default:
 {
    System.out.println(" You Have Enter Wrong Choice!!!");
 }
}
}
}
