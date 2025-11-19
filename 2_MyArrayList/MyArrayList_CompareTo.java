//10
//IN MyArrayList<E>
------------------------------MEMORIZE

-COMPARE CLASS. (GEOMETRIC-OBJECT(PARAMETER) W/ CALLING)
-COMPARE METHODS. AREA
-RETURN (0 / -1 / 1)

-----------------------------THEORY----------------------------------------
//FIRST
//Change MyArrayList :
//public abstract class MyArrayList<E> implements Comparable<GeometricObject>

//SECOND
//Create getClass / getArea / getName... use MyArrayList_GetMethod

//THIRD
//create compareTo method - "this" circle/"g" rectangle
------------------------------CODE---------------------------------
public int compareTo(GeometricObject g)
{
	//check datatype
	if(this.getClass().equals(g.getClass()))
	{
		//cast on g - to compare actual content
		Cricle c = (Cricle)g;
		
		//compare Area
		if(this.getArea()==c.getArea())
			return 0;
		else
			if(this.getArea()<c.getArea())
				return -1;
			else
				return 1;
	}
	else
		return this.getClass().getName().compareTo(g.getClass().getName());//This compareTo from SuperClass
}

-----------------------------------PRACTICE----------------------------

public int compareTo(GeometricObject g)
{
	if(this.getClass().equals(g.getClass()))
	{
		Circle c = (Circle)g;
		
		if(c.getArea()==g.getArea())
			return 0;
		else if(c.getArea()<g.getArea())
			return -1;
		else
			return 1;
	}
	else
	{
		return this.getClass().getName().compareTo(g.getClass().getName());
	}
		
}