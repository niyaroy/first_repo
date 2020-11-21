
import java.util.Scanner;
import java.io.*;
import payment.*;//packages
abstract class dental //abstract class 
{	
	static class payment //static class
	{
		void payment(int a)//function overloading
		{
 			System.out.println("Amount:"+a);
		}
		void payment(int a,int b)
		{
			 System.out.println("Amount for metal self ligating braces:"+a);
 			 System.out.println("Amount for ceramic Braces:"+b);

		}
	}

	
	public void show()
	{
		StringBuffer str = new StringBuffer("welcome to "); //stringbuffer class
		str.append("Smile dental clinic");
		System.out.println(str);

	}
	abstract void gettype(); //abstract method

}

class doctor extends dental
{	
	
    String did, dname, specilist, appoint, doc_qual;
	int droom; 

	public void show()
	{
		super.show();
		String str1 = new String("Register here!"); //string class
		System.out.println(str1);


	}
 
	   
	void doctor_info()
    	{
		
        	System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t\t" + appoint + "     \t" + doc_qual + "       \t" + droom);

    	}
	void gettype()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter which type u want");
		int type=s.nextInt();
	}

}

class Rn31
{
	String fname;
	String lname;
	String phno;
	String address;
	String pwd;
	String eml;
	static int a=3000;
	static int b =4000;
	static int c=2000;
	static int d=20000;
	static{ 		//static block
		System.out.println("Every thooth in a man's head is more valuable that a diomond");	
	}

	static void fee() //static method
	{
		System.out.println("Root Cannal:"+a);
		System.out.println("Gum disease:"+b);
		System.out.println("Teeth pronlem:"+c);
		System.out.println("Teeth clipping:"+d);
	}
	
	
 Rn31(String fname,String lname,String phno,String eml,String pwd,String address)//constructor
	{
		this.fname=fname;
		this.lname=lname;
		this.phno=phno;
		this.eml=eml;
		this.pwd=pwd;
		this.address=address;
		if(this.fname.equals("") || this.lname.equals("") || this.phno.equals("")|| this.eml.equals("") || this.pwd.equals("") || this.address.equals("")||this.fname == null || this.lname == null || this.phno==null || this.eml == null || this.pwd== null || this.address== null)
	{
			System.out.println("please enter all fields");
			System.exit(4);
		
	}
	else
	{
			System.out.println("Successfully Registered");
	}
}
 

	public static void main(String args[])
	{	
		System.out.println(args[0]);
		String fname;
		String lname;
		String phno;
		String eml;
		String pwd;
		String address;
		int i;
		int j=0;
		int choice;
		doctor p=new doctor();
		p.show();
		payment1 p2=new payment1();
		
		Scanner sc=new Scanner(System.in);
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
		dental.payment p1=new dental.payment();
		Rn31 br= new Rn31(fname,lname,phno,eml,pwd,address);
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
       	d[3].did = "21";
        	d[3].dname = "Dr.paul";
        	d[3].specilist = "pedodontics";
        	d[3].appoint = "10-11AM";
        	d[3].doc_qual = "MDS";
        	d[3].droom = 17;
       	d[4].did = "32";
        	d[4].dname = "Dr.George";
        	d[4].specilist = "prosthodontics";
        	d[4].appoint = "11-12AM";
        	d[4].doc_qual = "MDS";
        	d[4].droom = 45;
        	d[5].did = "17";
        	d[5].dname = "Dr.Issac";
        	d[5].specilist = "Orthodonics";
        	d[5].appoint = "1-2PM";
        	d[5].doc_qual = "MDS";
        	d[5].droom = 8;

	   System.out.println("\n Treatments available\n");
		String[] treatment={"1.Root Cannal","2.Gum Disease","3.Teath problem","4.Teath clipping"};
	
	for (String k : treatment)   
	{
	System.out.println(k);
	}
	fee();	
	choice = sc.nextInt();
	switch(choice)
	{
	case 1:
	{
	 System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t\tSpecilist  \t\t\tTiming \t \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
 	for (j = 0; j < 2;j++)
 	{
       d[j].doctor_info();
 	}
	p1.payment(3000);                              
	break;  
	
	}
	case 2:
	{
	System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t \t Specilist \t\t \tTiming \t \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
 	for (j = 2; j < 4;j++)
 	{
       d[j].doctor_info();
 	}   
	break;                             

	
	}
	case 3:

	{
	 System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t\tSpecilist  \t\t\tTiming \t \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
 	for (j = 4; j < 5;j++)
 	{
       d[j].doctor_info();
 	}   
	break;                             
	}
	case 4:	
	{
	 System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t\tSpecilist  \t\t\tTiming \t \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
 	for (j = 5; j <= 5;j++)
 	{
       d[j].doctor_info();
 	}   

p1.payment(20000,25000);
p.gettype();
p2.get_amount();
p2.get_details();                              
	break;                             
	}


	default:
 	{
    	System.out.println(" You Have Enter Wrong Choice!!!");
	}
}

}

}



