class plaindrome
{
	public static void main(String arg[])
	{
		int n=999;
		int num=0,rem;
		while(n!=0)
		{
			rem=n%10;
			num=(num * 10)+rem;
		}
		System.out.println(num);

	}
}
