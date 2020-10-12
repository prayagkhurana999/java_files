class binary
{
	public static void main(String arg[])
	{
		int n=153,rem=0,sum=0,temp;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);

		}
		if(temp==sum)
			System.out.println("Yes its is armstrong");
		else
			System.out.println("No it is not Armstrong");


	}
}
