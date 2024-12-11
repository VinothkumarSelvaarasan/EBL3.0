import java.util.Scanner;

public class ReadInputFromUser {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		int RegisterNumber;
		System.out.println("Enter the Register Number ");
		RegisterNumber=v.nextInt();
		System.out.println("Register Number "+RegisterNumber);
	}

}
