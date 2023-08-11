public class Cuadrado implements Figura{

    int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}
