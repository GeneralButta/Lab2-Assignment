//Aldayne Henry, Id:170426//
public class Drivermathlib {

	public static void main(String[] args) {
					
					IterationLibrary iteralib= new IterationLibrary();
					
					RecursionLibrary recurlib= new RecursionLibrary();
					
					System.out.println("------------Iteration-----------");
					
					ItVsRec(iteralib);
					
					System.out.println("-------------Recursion----------");
					
					ItVsRec(recurlib);				
					
	}
	
		public static void ItVsRec(MathLib library)
		{
			
			System.out.println("GCD(20,10) = " +library.gcd(20,10));
			
			System.out.println("Fibonacci(20)");
			for(int n=0; n<20;n++)
			{
			System.out.println(+library.Fibonacci(n));
			}
			System.out.println("Ack(2,10)="+library.Ack(2,10));
			
			System.out.println("Hanoi(3)=" + library.Hanoi(3));
			

	}

}
