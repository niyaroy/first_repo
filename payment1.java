package payment;
import java.util.*;
import java.lang.*;
interface amount 
{
	void get_amount();
}
interface details
{
	void get_details();
}
public class payment1 implements amount,details //interface
{
	public static int opt;
	Scanner s=new Scanner(System.in);
	public void get_amount()
	{
		
		System.out.println("Enter the amount");
		int am=s.nextInt();
		
	}
	public void get_details()
	{
		System.out.println("\npayment options\nDebit/ATM card\nCredit card");
		opt=s.nextInt();
	}		
}
