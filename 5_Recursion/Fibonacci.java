//2

---------------------------CODE-----------------------------
public static long fib(long index)
{
	if(index==0)
		return 0; //Base Call "index=0"
	else if(index==1)
		return 1; //Base Call "index=1"
	else 
		return fib(index-1)+fib(index-2); //Recursive call - "Reduced problem"/"Call itself" "index>=2"
		
}

----------------------------PRACTICE-----------------------------

public static long fib(int n)
{
	if(n==0)
	{
		return 0;
	}
	else if (n==1)
	{
		return 1;
	}
	else
	{
		return fib(n-1)+fib(n-2);
	}
}