//Aldayne Henry, Id:170426//
public class RecursionLibrary extends MathLib {
	
	
		public int gcd(int x, int y)
		{
			int temp=0;
			if(x < y)
			{
				temp=x;
				x=y;
				y=temp;
				
			}
			
			if(y==0)
			{
				return x;
				
			}
			else if (x>=y && x != 0)
			{
				return gcd(y, x % y);
			}
			
			return 1;
		}
	
		
		public int Ack (int x, int y)
		{
			if(x==0)
			{
				return y+1;
			}
			else if(y==0)
				{
					return Ack(x-1,1);
				}
			else if(x!=0 && y!=0)
					{
						return Ack(x-1, Ack(x, y-1));
					}
					return 1;
		}
			
		public int Fibonacci(int x)
		{
			if (x==0)
			{
				return 0;
			}
			
			else if (x==1)
			{
				return 1;
			}
			else
			{
				return Fibonacci(x-1) + Fibonacci(x-2);
			}
			
			
		}
		
		public int Hanoi (int n)
		{
			if (n==1)
			{
				return 1;
			}
			else if(n>1)
			{
				return 2*Hanoi(n-1)+1;
			}
			else
			 return 0;
		}
			
		
}
