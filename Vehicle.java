public class Vehicle{
	
public static void main(String args[])
{
  Brand[] obj= new Brand[3];
  obj[0]=new Brand(13245,"Benz",7000000);
  obj[1]=new Brand(23456,"Toyota",2000000);
  obj[2]=new Brand(23458,"R15",400000);
  System.out.println("Brand1:");
  obj[0].display();
  System.out.println("Brand2:");
  obj[1].display();
  System.out.println("Brand3:");
  obj[2].display();
}
}
class Brand{
	int vno;
	String vname;
	int vprice;
	Brand(int no,String name,int price)
	{
		vno=no;
		vname=name;
		vprice=price;
}
public void display()
{
	System.out.println(vno);
	System.out.println(vname);
	System.out.println(vprice);
	
	
}
}