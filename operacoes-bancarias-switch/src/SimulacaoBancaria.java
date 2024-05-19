import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1: {
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    else {
                        System.out.println("Digite um valor maior que 0");
                    }
                    break;
                }

                case 2: {
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }

                case 0: {
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                }

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }

        }
    }
}