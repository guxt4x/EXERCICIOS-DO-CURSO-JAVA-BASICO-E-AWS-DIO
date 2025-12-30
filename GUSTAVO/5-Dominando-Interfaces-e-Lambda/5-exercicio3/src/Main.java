private static final Scanner sc = new Scanner(System.in);

void main() {
    int option;
    while (true) {
        IO.println("Escolha uma forma geométrica para calcular: ");
        IO.println("1 - Circulo");
        IO.println("2 - Quadrado ");
        IO.println("3 - Retângulo ");
        IO.println("4 - Sair ");

        option = sc.nextInt();
        FormaGeometrica forma;

        if (option == 1) {
            forma = criarCirculo();

        } else if (option == 2) {
            forma = criarQuadrado();

        } else if (option == 3) {
            forma = criarRetangulo();

        } else if (option == 4) {
            IO.println("Saindo...");
            break;

        } else {
            IO.println("Opção inválida!");
            continue;
        }

        IO.println("O resultado da área é: " + forma.getArea());
    }
}

private static FormaGeometrica criarCirculo() {
    IO.print("Informe o raio:");
    double raio = sc.nextDouble();
    return new Circulo(raio);
}

private static FormaGeometrica criarQuadrado() {
    IO.print("Informe o tamanho dos lados:");
    double lado = sc.nextDouble();
    return new Quadrado(lado);
}

private static FormaGeometrica criarRetangulo() {
    IO.print("Informe a base:");
    IO.print("Informe a altura:");
    double base = sc.nextDouble();
    double altura = sc.nextDouble();
    return new Retangulo(base, altura);
}
