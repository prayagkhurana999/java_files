import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    System.out.println("Equal To Sum");
                }
            }
        }
        
    }
}
