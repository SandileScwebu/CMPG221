public static long factorial(int n) //Non-tail recursive
{
	if(n==0)
		return 1;//base
	else
		return n*factorial(n-1);//Recursive call 
}

private static long factorial(int n,int result) //Tail recursive - no pending operation on return
{
	if(n==0)
		return result;
	else
		return factorial(n-1,n*result); //Recursive call
}