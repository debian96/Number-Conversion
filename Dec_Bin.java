import java.util.Scanner;

public class Dec_Bin {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rem, bin=0, i=1;
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		while(no!=0) {
			rem = no%2;
			bin = bin+(rem*i);
			no = no/2;
			i = i*10;
		}
		System.out.println(bin);
     }
}
