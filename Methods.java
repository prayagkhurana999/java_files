 public class methods {
	public static void main(String[] args) 
	{
		String s="Hello";
		String s1=new String("hello world");
		char c=s.charAt(4);
		System.out.println(c);
		byte[] d=s.getBytes();
		System.out.println(d);
		System.out.println(s1.length());
		char[] e=s1.toCharArray();
		System.out.println(e);
		char[] f=new char[4];
		s1.getChars(2,6,f,0);
	System.out.println(f);
	int w=s.compareTo(s1);
	System.out.println(w);
	if(s.equals(s1))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	boolean q=s.endsWith("lo");
	System.out.println(q);
	boolean h=s.startsWith("s");
	System.out.println(h);
	}

}
