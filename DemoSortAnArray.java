import java.util.Scanner;
import java.util.*;
public class DemoSortAnArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();

		System.out.println("Enter e/E for exit");
		System.out.println("Enter your value: ");

		do{
			try{
				String in=scn.nextLine();
				if(in=="e"||in=="E") break;
				arr.add(Integer.parseInt(in));
			} catch(Exception e){break;}

		} while(true);

		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
	}
}