package exercicios;
import java.util.Scanner;

public class Exercicio05 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a temperatura em graus Celsius:");
	        double temperaturaCelsius = scanner.nextDouble();

	        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

	        System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);

	        scanner.close();
	    }
}
