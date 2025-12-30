public record Retangulo (double height, double base) implements FormaGeometrica {

    @Override
    public double getArea() {
        return base * height;
    }
}
