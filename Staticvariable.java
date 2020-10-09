public class Main{
    
    
        int id;
        String name;
        static String company="khurana";
        Main(int id,String name)
        {
            this.id=id;
            this.name=name;
        }
        void display()
        {
            System.out.println("employ id is"+id+"name is"+name+"company is"+company);
        }
        public static void main(String args[])
        {
            Main m=new Main(1,"prayag");
            Main m1=new Main(2,"lakshay");
            m.display();
            m1.display();
        }
    
}
