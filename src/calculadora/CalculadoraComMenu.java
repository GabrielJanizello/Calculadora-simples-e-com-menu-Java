package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraComMenu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== Calculadora com Menu ===");

        // Loop principal
        while (opcao != 5) {
            exibirMenu();

            try {
                System.out.print("Escolha uma opção: ");
                opcao = entrada.nextInt();

                if (opcao == 5) {
                    System.out.println("Encerrando a calculadora... ");
                    break;
                }

                System.out.print("Digite o primeiro número: ");
                double numero1 = entrada.nextDouble();

                System.out.print("Digite o segundo número: ");
                double numero2 = entrada.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1 -> resultado = somar(numero1, numero2);
                    case 2 -> resultado = subtrair(numero1, numero2);
                    case 3 -> resultado = multiplicar(numero1, numero2);
                    case 4 -> {
                        // Tratamento da divisão por zero
                        if (numero2 == 0) {
                            System.out.println(" Erro: divisão por zero não é permitida!\n");
                            continue;
                        }
                        resultado = dividir(numero1, numero2);
                    }
                    default -> {
                        System.out.println(" Opção inválida! Tente novamente.\n");
                        continue;
                    }
                }

                System.out.println("Resultado: " + resultado + "\n");

            } catch (InputMismatchException e) {
                System.out.println(" Entrada inválida! Digite apenas números.\n");
                entrada.nextLine(); // Limpa o buffer do Scanner
            }
        }

        entrada.close();
        System.out.println("Programa finalizado com sucesso!");
    }

    //Métodos separados para cada operação

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    // Metodo para exibir o menu
    public static void exibirMenu() {
        System.out.println("""
            -----------------------
            Escolha uma operação:
            1 - Somar
            2 - Subtrair
            3 - Multiplicar
            4 - Dividir
            5 - Sair
            -----------------------
        """);
    }
}

