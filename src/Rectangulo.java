public class Rectangulo extends FiguraGeometrica{
    private double Longitud;
    private double Ancho;

    public Rectangulo(String nombre, String color, double longitud, double ancho) {
        super (nombre, color);
        this.Longitud = longitud;
        this.Ancho = ancho;
    }

    public double calcularArea() {
        return Longitud * Ancho;
    }

    public double calcularPerimetro() {
        return 2 * (Longitud + Ancho);
    }
}
