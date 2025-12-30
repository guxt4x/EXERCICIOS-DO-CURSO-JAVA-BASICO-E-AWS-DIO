public record Circulo (double raio) implements FormaGeometrica {

    private static final double PI = 3.14;

    @Override
    public double getArea() {
        return PI * raio * raio;
    }
}
