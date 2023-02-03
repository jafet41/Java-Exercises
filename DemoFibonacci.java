import java.util.Scanner;

public class DemoFibonacci {
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter your desired fib number k ===> ");
		int k = Integer.parseInt(scn.nextLine());
		RecursionObj obj=new RecursionObj();
		int ans=obj.fib(k);
		System.out.println(ans);
	}
}

class RecursionObj {
	public int fib(int n){
		if(n==1 || n==2){
			return 1;
		} else if(n>=3){
			return fib(n-1)+fib(n-2);
		}
		return -1;
	}
}
//1,1,2,3,5,8,13,21,34,55,89,144,233,377,610