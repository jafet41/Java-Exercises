import java.util.*;
public class PatternMatch {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your text: ");
		String text=scn.nextLine();
		System.out.println("Enter your pattern: ");
		String pattern=scn.nextLine();
		int tlen=text.length();
		int plen=pattern.length();
		boolean res=false;
		char a,b; 
		for (int i=0; i<=tlen-plen; i++) {
			a=text.charAt(i);
			b=pattern.charAt(0);
			if(a==b){
				for (int j=i,k=0; j<i+plen; j++,k++) {
					a=text.charAt(j);
					b=pattern.charAt(k);
					if(a==b && k<plen-1){
						continue;
					} else if(a!=b){
						break;
					} else if(a==b && k==plen-1){
						res=true;
						break;
					}		
				}
			}
		}
		if(res){
			System.out.println("Pattern Found");
		}else{
			System.out.println("Not Found");
		}
	}
}