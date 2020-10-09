public class Pattern2
{
	public static void main(String[] args) 
	{
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
		for(int i=0;i<=3;i++){
		    for(int j=4;j>i;j--){
		        System.out.print("* ");
		        
		    }
		    System.out.println();
		}
	}
}
/*System.out.println();
for(i=0;i<3;i++)
{
for(j=0;j<=i;j++){
System.out.print("* ")
}*/
