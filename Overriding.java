import java.util.Scanner;
class display
{
	static void display(String a)
	{
		System.out.println(a);
	}
	 static void display(String a,String b)
	{
		System.out.println(a+"-"+b);
	}
}
class Overriding
{
	public static void main(String[] args){
		int n;
	String a,b;
	display d=new display();
	Scanner sc=new Scanner(System.in);
	
	n=sc.nextInt();

	if(n==1)
	{
			a=sc.nextLine();
		display(a);
	}
	else
	{
		a=sc.nextLine();
		b=sc.nextLine();
			display(a,b);
	}
}
}
