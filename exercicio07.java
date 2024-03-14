package exercicios;
import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da lata de óleo:");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura da lata de óleo:");
        double altura = scanner.nextDouble();

        double volume = calcularVolumeLataDeOleo(raio, altura);

        System.out.println("O volume da lata de óleo é: " + volume + " unidades cúbicas.");

        scanner.close();
    }

    public static double calcularVolumeLataDeOleo(double raio, double altura) {
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }
}
