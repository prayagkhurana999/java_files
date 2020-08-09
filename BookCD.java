import java.util.Scanner;
class Book{
	int pa,pr;
	String t,w;
	Book(String a,int b,int c,String d){
		t=a;
		pa=b;
		pr=c;
		w=d;
	} 
	void putdata(){
		System.out.println("title ="+t+"\npages ="+pa+"\nprice ="+pr+"\nwriter ="+w);
	}
}
/*class CD{
	int pC,time;
	String tC;
	CD(String a,int b,int c ){
		tC=a;
		pC=b;
		time=c;
	}
	void putdata(){
		System.out.println("title ="+tC+"\nprice ="+pC+"\ntime ="+time);

	}
}*/
class BookCD{
	public static void main(String[] args){
int price,pages,time;
String title,writer;
Scanner sc=new Scanner(System.in);
title=sc.nextLine();
pages=sc.nextInt();
price=sc.nextInt();
writer=sc.nextLine();
Book b=new Book(title,pages,price,writer);

/*title=sc.nextLine();
price=sc.nextInt();
time=sc.nextInt();
CD cd=new CD(title,price,time);
*/
b.putdata();
//cd.putdata();
}
}
