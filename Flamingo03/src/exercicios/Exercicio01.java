package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite sua idade em anos, meses e dias:");
	        System.out.print("Anos: ");
	        int anos = scanner.nextInt();
	        System.out.print("Meses: ");
	        int meses = scanner.nextInt();
	        System.out.print("Dias: ");
	        int dias = scanner.nextInt();

	        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
	        System.out.println("Sua idade em dias é: " + idadeEmDias);

	        scanner.close(); // fechando o Scanner após o uso
	    }

	    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
	        int idadeEmDias = anos * 365; // 1 ano = 365 dias

	        // Adiciona os dias dos anos bissextos
	        idadeEmDias += contarDiasBissextos(anos);

	        // Adiciona os dias dos meses
	        for (int i = 1; i < meses; i++) {
	            idadeEmDias += diasNoMes(i);
	        }

	        // Adiciona os dias do último mês
	        idadeEmDias += dias;

	        return idadeEmDias;
	    }

	    // Função para contar quantos anos bissextos ocorreram entre 0 e n
	    public static int contarDiasBissextos(int n) {
	        return n / 4 - n / 100 + n / 400;
	    }

	    // Função para obter o número de dias em um determinado mês
	    public static int diasNoMes(int mes) {
	        if (mes == 2) {
	            return 28; // Fevereiro tem 28 dias em anos não bissextos
	        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	            return 30; // Abril, junho, setembro e novembro têm 30 dias
	        } else {
	            return 31; // Os outros meses têm 31 dias
	        }
	    }
}

