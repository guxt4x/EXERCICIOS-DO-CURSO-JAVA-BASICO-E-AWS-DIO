import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.printf("Informe o nome do titular da conta: ");
        String nomeDoTitular = sc.nextLine();
        System.out.printf("Informe o número da conta: ");
        String numeroDaConta = sc.nextLine();
        System.out.printf("Olá %s! Seja bem-vindo ao banco JavaBank.", nomeDoTitular);
        ContaBancaria conta = new ContaBancaria(false, 0.0, numeroDaConta, nomeDoTitular);

        System.out.println(" ------- Escolha a operação desejada ------- ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Consultar Cheque Especial");
        System.out.println("4 - Realizar depósito");
        System.out.println("5 - Realizar saque");
        System.out.println("6 - Pagar boleto");
        System.out.println("0 - Sair");
    }

    boolean opcao;
    do {
        switch (opcao) ->
            case
    }
}