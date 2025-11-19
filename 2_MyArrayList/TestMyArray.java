//1
//create class
public class TestMyArray{
	
	//create test class
	public static void main (String[] args){
		
		//create array 
		MyArrayList<Geometric Object> list = new MyArrayList<>();
		
		//create objects
		Circle c1 = new Circle(10,"red",false);
		
		Rectangle r1 = new Ractangle(5,3,"red",false);
		
		//add objects into array
		list.add(0,c1);
		list.add(1,r1);
		
		//display if == true
		if(list.sortlist())
			System.out.println(list);
	} 
}

----------PRACTICE---------

public class TestMyArray
{
	public static void(String[] args)
	{
		//
		MyArrayList<Geometric Object> list = new MyArrayList<Geometric Object>();
		//
		Circle c1 = new Circle(0,xxx,false);
		Rectangle r1 = new Rectangle(1,1,xx,true);
		//
		list.add(0,c1);
		list.add(0,r1);
		
		if(list.sortlist())
		{
			System.out.println(list);
		}
		
	}
}