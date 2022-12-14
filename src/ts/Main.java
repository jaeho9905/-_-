package ts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sys_implement sys = new Sys_implement();

		sys.setScanner(scanner);

		sys.start();

		scanner.close();
	}

}
