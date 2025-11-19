//10-TESTCLASSS
//public class MyArrayList<E>
public class MyArrayList<E>
{
	private int size;
	private E[] data;
	private int MAX; 
	
	public MyArrayList()
	{
		data = (E[]) new Object[MAX];
		size=0;
	}
	
	public void add(int index, E e)
	{
		if(index<0||index>=size)
		{
			throw new IndexOutOfBoundException();
		}
		
		for(int i=index;/*i>=size*/;i--)
			data[i+1]=data[i];
			
		data[index]=e;
		size++;
	}
	
	public boolean isContains(E e)
	{
		for(int i=0;i<size;i++)
		{
			if(/*e.equals(data[i])*/)
				return true;
		}
		return false;
	}
	
	
	public E getElement(int index)
	{
		if(index<0||index>0)
		{
			throw new INdexOutOfBoundsException();
		}
		
		return data[index];
		
	}
	
	public E remove(int index)
	{
		if(index<0||index>=size)
			throw new IndexOutOfBoundException();
		
		E e = data[index];
		
		for(int i=index;i<=size-1;i++)
		{
			data[j]=data[j+1];
		}
		//data[size-1]=null
		size--;
		return e;
	}
	
	public String toString()
	{
		String result="[";
		
		for(int i=0;i<size;i++)
		{
			result +=data[i];
			if(i<size-1)
				result+=",";
		}
		return result/*.toString*/+"]";
		
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean sortList()
	{
		E hold;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=0;j<=size-1;i++)
			{
				if(((Comparable)data[j]).compareTo(data[j+1])>0)
				{
					hold=data[j];
					data[j]=data[j+1];
					data[j+1]=hold;
				}
			}
		}
		return true;
		
	}
	
	public int compareTo(GeometricObject g)
	{
		
		
		if(this.getClass()==c.getClass)
		{
			Circle c = (Circle)g;
			
				if(this.getArea()==c.getArea())
				{
					return 0;
				}
				else if (this.getArea()<c.getArea())
				{
					return -1;
				}
				else
				{
					return 1;
				}
		}
		else
		{
			return this.getClass().getName().compareTo(g.getClass().getName())
		}
	}
	
}
------------------------------------------------------------PRACTICE----------------------------------------------------------

public class MyArrayList<E>
{
	private int size;
	private E[] data;
	private int MAX; 
	
	public MyArrayList()
	{
		data = (E[]) new Object[MAX];
		size=0;
	}
	
	public void add(int index, E e)
	{
		if(index<0||index>=size)
		{
			throw new IndexOutOfBoundException();
		}
		
		for(int i=index;/*i>=size*/;i--)
			data[i+1]=data[i];
			
		data[index]=e;
		size++;
	}
	
	public boolean isContains(E e)
	{
		for(int i=0;i<size;i++)
		{
			if(/*e.equals(data[i])*/)
				return true;
		}
		return false;
	}
	
	
	public E getElement(int index)
	{
		if(index<0||index>0)
		{
			throw new INdexOutOfBoundsException();
		}
		
		return data[index];
		
	}
	
	public E remove(int index)
	{
		if(index<0||index>=size)
			throw new IndexOutOfBoundException();
		
		E e = data[index];
		
		for(int i=index;i<=size-1;i++)
		{
			data[j]=data[j+1];
		}
		//data[size-1]=null
		size--;
		return e;
	}
	
	public String toString()
	{
		String result="[";
		
		for(int i=0;i<size;i++)
		{
			result +=data[i];
			if(i<size-1)
				result+=",";
		}
		return result/*.toString*/+"]";
		
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean sortList()
	{
		E hold;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=0;j<=size-1;i++)
			{
				if(((Comparable)data[j]).compareTo(data[j+1])>0)
				{
					hold=data[j];
					data[j]=data[j+1];
					data[j+1]=hold;
				}
			}
		}
		return true;
		
	}
	
	public int compareTo(GeometricObject g)
	{
		
		
		if(this.getClass()==c.getClass)
		{
			Circle c = (Circle)g;
			
				if(this.getArea()==c.getArea())
				{
					return 0;
				}
				else if (this.getArea()<c.getArea())
				{
					return -1;
				}
				else
				{
					return 1;
				}
		}
		else
		{
			return this.getClass().getName().compareTo(g.getClass().getName())
		}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}