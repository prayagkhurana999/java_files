import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int array[]=new int[n+1];
        for( i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            
        }
        System.out.println("Enter the element to add");
        int ele=sc.nextInt();
        array[n]=ele;
        for( i = 0; i <n; i++)
        {
            System.out.print(array[i]+",");
        }
        System.out.print(array[n]);
 
        
    }
}
