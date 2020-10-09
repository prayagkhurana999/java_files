import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,times,size,ele;
		times=sc.nextInt();
		for(i=0;i<times;i++)
		{
			size=sc.nextInt();
			ele=sc.nextInt();
			int[] a=new int[size];
			for(i=0;i<size;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<size;i++)
			{
				if(a[i]==ele)
				{
					System.out.println(i);
					break;
				}
			}


		}
		

	}
}
