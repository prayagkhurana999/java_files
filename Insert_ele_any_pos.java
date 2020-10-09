import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,ele,pos;
        int arr[]=new int[n+1];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter position to set");
        pos=sc.nextInt();
         System.out.println("Enter the element");
        ele=sc.nextInt();
        for(i=n-1;i<pos-1;i--)
        {
            arr[i+1]=arr[i];
        }
       
        arr[pos-1]=ele;
        System.out.println("Added see");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
