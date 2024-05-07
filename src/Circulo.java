public class Circulo extends FiguraGeometrica{
    private double Radio;

    public Circulo(String nombre, String color, double radio) {
        super (nombre, color);
        this.Radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Radio * Radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * Radio;
    }
}
