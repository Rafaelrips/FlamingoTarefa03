package exercicios;
import java.util.Scanner;

public class Exercicio04 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o custo de fábrica do carro:");
	        double custoFabrica = scanner.nextDouble();

	        double percentualDistribuidor = 0.28;
	        double percentualImpostos = 0.45;

	        double custoDistribuidor = custoFabrica * percentualDistribuidor;
	        double custoImpostos = custoFabrica * percentualImpostos;
	        double custoConsumidor = custoFabrica + custoDistribuidor + custoImpostos;

	        System.out.println("O custo final ao consumidor é: R$" + custoConsumidor);

	        scanner.close();
	    }
}
