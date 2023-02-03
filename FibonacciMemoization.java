import java.util.*;

public class FibonacciMemoization {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter desired nth Fibonacci n: ");
		long n=Long.parseLong( s.nextLine() );

		HashMap<Long, Long> memo = new HashMap<Long, Long>();
		long res=FibonacciMemoization.fib(n,memo);

		System.out.println("Result: "+res);
	}
	//Works until n=92
	public static long fib(long n,HashMap<Long,Long> memo){
		if( memo.containsKey(n) ) {
			//System.out.println("memo => "+memo);
			return memo.get(n);}
		if( n>=1 && n<=2 ) return 1;
		memo.put( n , fib(n-1,memo)+fib(n-2,memo) );
		return memo.get(n);
	}
}

// int i=5;
// Integer a = new Integer(53);		//Boxing
// Integer b = 42;					//Autoboxing
// int j = a.intValue();			//Unboxing
// int k = a;						//Autounboxing