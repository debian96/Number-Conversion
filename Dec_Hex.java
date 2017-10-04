import java.util.Scanner;

public class Dec_Hex {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rem, i=0;
		char[] hex = new char[100];
		System.out.println("Enter a no:-");
		int no = sc.nextInt();
		while(no!=0) {
			rem = no%16;
			
			if (rem<10) {
				hex[i] = (char) (rem + 48);
				
				i++;
			}else {
				hex[i] =(char) (rem + 55);
				i++;
			}
			
			no = no/16;
		}
		for (int j = hex.length-1; j >=0; j--) {
			System.out.print(hex[j]);
		}
	}
}
