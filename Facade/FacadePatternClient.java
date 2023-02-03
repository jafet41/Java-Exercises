import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
	private static int choice;

	public static void main (String args[]) throws NumberFormatException, IOException{
		do{
			System.out.println("============= Mobile Shop ===============\n");
			System.out.println("	1.- Iphone	\n");
			System.out.println("	2.- Samsung	\n");
			System.out.println("	3.- Blackberry	\n");
			System.out.println("	4.- Exit	\n");
			System.out.println("Enter your choice: ");

			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			choice=Integer.parseInt(br.readLine());
			ShopKeeper sk= new ShopKeeper();

			switch (choice){
			case 1:
				{
					sk.iphoneSale();
				}
				break;
			case 2:
				{
					sk.samsungSale();
				}
				break;
			case 3:
				{
					sk.blackberrySale();
				}
				break;
			default:
				{
					System.out.println("Nothing you purchased");
				}
				return;
			}
		}while(choice!=4);
	}
}