import java.util.Scanner;
public class DemoReverseAString {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter your string: ");
		String a=scn.nextLine();
		String b=DemoReverseAString.reverse(a);
		System.out.println(b);		
	}

	public static String reverse(String param){
		String result="";
		int n=param.length();
		for(int i=0; i<n;i++){
			result+=param.charAt(n-i-1);
		}
		return result;
	}
}


