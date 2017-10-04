import java.util.Scanner;

public class Oct_Dec {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rem, dec=0,base=1;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		while(no!=0) {
			rem = no%10;
			dec = dec+(rem*base);
			no = no/10;
			base = base * 8;
		}
		System.out.println(dec);
	}
}
