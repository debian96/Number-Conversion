import java.util.Scanner;

public class Hex_Dec {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int dec=0, base=1;
		System.out.println("Enter Hex value:-");
		String hex = sc.next();
		
		for (int i = hex.length()-1; i >= 0; i--) {
			char x = hex.charAt(i);
			
			if (x>='0' && x<='9') {
				dec = dec + (x-48)*base;
				base = base * 16;
			}else if(x>='A' && x<='F') {
				dec = dec + (x-55)*base;
				base = base * 16;
			}
		}
		System.out.println(dec);
	}
}
