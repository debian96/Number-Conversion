import java.util.Scanner;

public class Dec_Oct {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rem, oct=0, i=1;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		while(no!=0) {
			rem = no%8;
			oct = oct+(rem*i);
			no = no/8;
			i = i*10;
		}
		
		System.out.println(oct);
	}
}
