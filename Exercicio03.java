package exercicios;

import java.util.Scanner;


public class Exercicio03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salário atual e o percentual de reajuste
        System.out.println("Digite o salário mensal atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste:");
        double percentualReajuste = scanner.nextDouble();

        // Calcular o novo salário
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        // Exibir o novo salário
        System.out.println("O novo salário do funcionário é: R$" + novoSalario);

        scanner.close();
    }
}
