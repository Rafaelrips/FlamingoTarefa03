package exercicios;

import java.util.Scanner;


public class Exercicio02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número total de eleitores:");
        int totalEleitores = scanner.nextInt();

        System.out.println("Informe o número de votos brancos:");
        int votosBrancos = scanner.nextInt();

        System.out.println("Informe o número de votos nulos:");
        int votosNulos = scanner.nextInt();

        System.out.println("Informe o número de votos válidos:");
        int votosValidos = scanner.nextInt();

        // Calcular percentuais
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        // Exibir resultados
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        scanner.close();
    }
}
