import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1;
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		System.out.print(a+", "+b+", ");
		int i,c=2;
		while(c!=n) {
			i = a+b;
			System.out.print(i+", ");
			a = b;
			b = i;
			c++;
		}
		sc.close();

	}

}