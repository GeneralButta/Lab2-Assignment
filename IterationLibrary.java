//Aldayne Henry, Id:170426//
public  class IterationLibrary extends MathLib {
				
		public int gcd(int x, int y)
		{
				
			for(int i=x; i>0;i--)
			{
				if(x%i==0 && y % i==0)
				{
					return i;
				}
			}
			return 0;
		}
		

		
		public int Fibonacci(int x)
		{
			 int z=0, r=1, m=0;
			 
			 
			 for(int i=0;i<x;i++)
			 {
				 m=z+r;
				 z=r;
				 r=m;
			 }
			 return z;
		}
		
		public int Ack(int x, int y)
		{
				for(int i=0; i<y;i++)
				{
					if(x<2)
					{
						return x+y+1;
						
					}
					else if(x==2)
					{
						return x*y+x+1;
					}
					else if(x>2)
					{
						int n=2;
						for(int j=1;j<x+y;j++)
						{
							n*=2;
						}
						return n-3;
					}
				}
				return 0;
			}
		
		public int Hanoi(int n)
		{
			int j=2;
			
			for(int i=1; i<n;i++)
			{
				j*=2;
			}
			return j-1;
		}
	

}
