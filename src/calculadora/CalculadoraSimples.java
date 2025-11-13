package calculadora;

import java.util.InputMismatchException;
import  java.util.Scanner; //importando a classe scanner p/ entrada de dados

public class CalculadoraSimples { //aqui define uma classe pública.
    public static void main(String[] args) {
        // metodo que o java executa primeiro ao rodar o programa.
        // tudo que o programa deve fazer precisa estar dentro das chaves{} do metodo main.
        Scanner entrada = new Scanner(System.in); //cria o leitor de dados
        String sair = "";

        System.out.println("=== Calculadora Simples ===");
        System.out.println("Digite 'sair' a qualquer momento para encerrar.\n");

        while (!sair.equalsIgnoreCase("sair")) { //Compara strings sem diferenciar maiúsculas e minúsculas (aceita "Sair", "SAIR", "sair" etc.).
            double numero1 = 0, numero2 = 0;
            String operacao;

            try {
                //leitura do primeiro número
                System.out.print("Digite o primeiro número: ");
                if (entrada.hasNext("sair")) break;
                numero1 = entrada.nextDouble();

                //leitura do segundo número
                System.out.print("Digite o segundo número: ");
                if (entrada.hasNext("sair")) break;
                numero2 = entrada.nextDouble();

                //leitura da operação
                System.out.print("Digite o operacao ( +, -, *, / ): ");
                operacao = entrada.next();

                double resultado;

                switch (operacao) {
                    case "+" -> resultado = numero1 + numero2;
                    case "-" -> resultado = numero1 - numero2;
                    case "*" -> resultado = numero1 * numero2;
                    case "/" -> {
                        if (numero2 == 0) {
                            System.out.print("ERRO: divisão por zero não é permitido!\n");
                            continue;
                        }
                        resultado = numero1 / numero2;
                    }
                    default -> {
                        System.out.println("Operação inválida! Use +, -, *, ou /.\n");
                        continue;
                    }
                }

                System.out.println("Resultado: " + resultado);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.\n");
                entrada.nextLine();
                continue;
            }

            //pergunta se o usuário quer sair.
            entrada.nextLine();
            System.out.print("Digite 'sair' para encerrar ou Enter para continuar: ");
            sair = entrada.nextLine();
            System.out.println();
        }

        entrada.close(); //boa pratica fechar o scanner ao final.
        System.out.println("Calculadora finalizada. Até logo!");
    }
}
