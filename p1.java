package drill;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String order = input.next();
		int price = 0;
		switch(order) {
		case "q":
			price=100;
		case "p":
			price=200;
		}
		System.out.println(price);
		
}
}
