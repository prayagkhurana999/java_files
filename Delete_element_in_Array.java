import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,pos;
        int arr[]=new int [n+1];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        pos=sc.nextInt();
        for(i=pos-1;i<n;i++)
        {
            arr[i]=arr[i+1];
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
