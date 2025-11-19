//1
				
/*
factorial(2) =  2*factorial(1)
				2*1*factorial(0)
				2*1*1
				2*1
				2
								
				*/
-----------------------------------------------CODE-----------------------------
public static long factorial(int n)
{
	if(n==0)
		return 1;	//Base Case factorial(0) = 1
	else
		return n*factorial(n-1); //Recursive call - "reduced problem"/"factorial pattern" factorial(n) = n * factorial(n-1)
}

----------------------------------------------PRACTICE-----------------------

public static long factorial(int n)
{
	if(n==0)
	{
		return 1;
	}
	else
	{
		return n*factorial(n-1);
	}
}