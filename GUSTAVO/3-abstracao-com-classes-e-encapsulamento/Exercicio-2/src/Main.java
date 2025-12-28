import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao seu carro !");
        Carro carro = new Carro(false, 0, 0);

        int escolha;
        do {
        System.out.println("Digite a ação que deseja realizar: ");
        System.out.println("1 - Ligar o carro");
        System.out.println("2 - Desligar o carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");
        System.out.println("5 - Trocar marcha");
        System.out.println("6 - Verificar velocidade");
        System.out.println("0 - Sair");

        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                carro.ligar();
                break;
            case 2:
                carro.desligar();
                break;
            case 3:
                System.out.println("Digite o valor para acelerar:");
                int incremento = sc.nextInt();
                carro.acelerar(incremento);
                break;
            case 4:
                System.out.println("Digite o valor para frear:");
                int decremento = sc.nextInt();
                carro.frear(decremento);
                break;
            case 5:
                System.out.println("Digite a nova marcha:");
                int novaMarcha = sc.nextInt();
                carro.trocarMarcha(novaMarcha);
                break;

                // ARRUMAR, ESTÁ PARANDO O LOOP AQUI
                
            case 6:
                carro.verificarVelocidade();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Ação inválida. Tente novamente.");
        }
        } while (escolha != 0);
    }
}
