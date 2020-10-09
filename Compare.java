import java.util.*;
class compare
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
int a,temp;
a=sc.newInt();
temp=a;
while(temp>0)
{
int rem,s;
rem=temp%10;
temp=temp/10;
s=(s*10)+rem;
}
if(s==a)
System.out.println("Equal");
else
System.out.println("Not Equal");
n--;
}
}
}
