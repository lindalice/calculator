import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	static void sum(double x1, double y1) {
		double sum = x1 + y1;

		System.out.println(df.format(x1) + " + " + df.format(y1) + " = " + df.format(sum));
	}

	static void sub(double x1, double y1) {
		double sub = x1 - y1;

		System.out.println(df.format(x1) + " - " + df.format(y1) + " = " + df.format(sub));
	}
	static void mul(double x1, double y1) {
		double mul = x1 * y1;

		System.out.println(df.format(x1) + " * " + df.format(y1) + " = " + df.format(sum));
	}
	static void div(double x1, double y1) {
		double div = x1 / y1;

		System.out.println(df.format(x1) + " / " + df.format(y1) + " = " + df.format(sum));
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		char operator;
		// -------------------
		double x1 = 0;
		System.out.print("Ievadi 1. ciparu (decimālskaitļa atdalīšanai izmanto '.'): ");
		String x = input.nextLine();

		try {
			x1 = Double.parseDouble(x);

		} catch (NumberFormatException e) {
			System.out.println("Jāievada skaitlis!");
			System.exit(0);
		}
		// --------------------
		double y1 = 0;
		System.out.print("Ievadi 1. ciparu (decimālskaitļa atdalīšanai izmanto '.'): ");
		String y = input.nextLine();

		try {
			y1 = Double.parseDouble(y);

		} catch (NumberFormatException e) {
			System.out.println("Jāievada skaitlis! Mēģini vēlreiz!");
			System.exit(1);
		}

		// --------------------
		System.out.print("Izvēlies darbību: '+' vai '-' vai '*' vai '/', ievadot kādu no minētajiem simboliem '+', '-', '*' vai '/'.");
		operator = input.next().charAt(0);

		switch (operator) {
		case '+':
			sum(x1, y1);
			break;
		case '-':
			sub(x1, y1);
			break;
		case '*':
			mul(x1, y1);
			break;
		case '/':
			div(x1, y1);
			break;
		default:
			System.out.println("Nekorekti ievadīta darbība, mēģini vēlreiz");
			break;

		}
		input.close();
	}

}
