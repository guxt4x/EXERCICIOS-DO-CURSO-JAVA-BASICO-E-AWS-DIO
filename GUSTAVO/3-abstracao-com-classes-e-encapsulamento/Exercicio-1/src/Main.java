import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    System.out.printf("Informe o nome do titular da conta: ");
    String nomeDoTitular = sc.nextLine();
    System.out.printf("Informe o número da conta: ");
    String numeroDaConta = sc.nextLine();
    System.out.printf("Olá %s! Seja bem-vindo ao banco JavaBank.\n", nomeDoTitular);
    
    ContaBancaria conta = new ContaBancaria(false, 0, nomeDoTitular, numeroDaConta, 0);

    int opcao; 
    do {
        System.out.println();
        System.out.println(" -------  OPERAÇÕES DISPONÍVEIS ------- ");
        System.out.println("1 - Realizar depósito");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Consultar Cheque Especial");
        System.out.println("5 - Pagar boleto");
        System.out.println("0 - Sair");
        System.out.printf("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Informe o valor a ser depositado: ");
                double valorDeposito = sc.nextDouble();
                conta.realizarDeposito(valorDeposito);
                break;

            case 2:
                System.out.printf("Informe o valor do saque: ");
                double valorSaque = sc.nextDouble();
                conta.Sacar(valorSaque);
                break;

            case 3:
                System.out.printf("Seu saldo atual é: R$ %.2f\n", conta.getSaldo());
                break;

            case 4:
                System.out.printf("Seu limite do cheque especial é: R$ %.2f\n", conta.getLimiteChequeEspecial());
                break;

            case 5:
                System.out.printf("Informe o valor do boleto: ");
                double valorBoleto = sc.nextDouble();
                conta.pagarBoleto(valorBoleto);
                break;

            case 0:
                System.out.println("Obrigado por usar o JavaBank. Até logo!");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 0);
    sc.close();
    }
}