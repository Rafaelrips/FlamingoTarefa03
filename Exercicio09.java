package exercicios;
import java.util.Scanner;

public class Exercicio09 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor da prestação:");
	        double valor = scanner.nextDouble();

	        System.out.println("Digite a taxa de juros em percentual:");
	        double taxa = scanner.nextDouble();

	        System.out.println("Digite o tempo em meses em atraso:");
	        int tempo = scanner.nextInt();

	        double prestacao = calcularPrestacao(valor, taxa, tempo);

	        System.out.println("O valor da prestação em atraso é: " + prestacao);

	        scanner.close();
	    }

	    public static double calcularPrestacao(double valor, double taxa, int tempo) {
	        double prestacao = valor + (valor * taxa / 100) * tempo;
	        return prestacao;
	    }
}
