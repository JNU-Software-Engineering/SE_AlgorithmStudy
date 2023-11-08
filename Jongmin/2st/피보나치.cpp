#include <stdio.h>

int Fibonacci(int n, int a=0, int b=1, int t=1);

int main()
{
	int n;
	
	scanf("%d", &n);
	
	printf("%d", Fibonacci(n));
}

int Fibonacci(int n, int a, int b, int t)
{
	int next = a+b;
	
	if(n==0 && t)
	{
		t=0;
		return 0;
	}
	
	else if(n>2) return Fibonacci(n-1, b, next);
	
	else return next;
}