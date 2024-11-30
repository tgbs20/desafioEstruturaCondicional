package application;

import java.util.Scanner;

public class desafioEstruturaCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salario = scanner.nextDouble();

        double percentualAumento = 0;
        double aumento = 0;
        double salarioNovo = 0;
        double aumentoReal = 0;
        double inflacao = 3.8 / 100;

        if (salario <= 280) {
            percentualAumento = 0.20;
        } else if (salario <= 700) {
            percentualAumento = 0.15;
        } else if (salario <= 1499) {
            percentualAumento = 0.10;
        } else {
            percentualAumento = 0.05;
        }

        aumento = salario * percentualAumento;
        salarioNovo = salario + aumento;
        aumentoReal = aumento - (aumento * inflacao);

        System.out.println("\n--- Resultado do Reajuste ---");
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário, após o aumento: R$ " + salarioNovo);
        System.out.println("Valor do aumento real (descontando inflação): R$ " + aumentoReal);

        scanner.close();
    }
}
