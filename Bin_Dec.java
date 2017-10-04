import java.util.Scanner;

class Bin_Dec {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rem, dec=0, i=0;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		while(no!=0) {
			rem = no%10;
			dec = dec+(rem<<i);
			no = no/10;
			++i;
		}
		System.out.println(dec);
	}
}
