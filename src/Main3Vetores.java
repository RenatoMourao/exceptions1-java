import java.util.Locale;
import java.util.Scanner;

public class Main3Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = kb.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("Average Height = %.2f%n", avg);

		kb.close();
	}

}
