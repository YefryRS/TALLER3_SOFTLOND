public class Circulo implements Figura{

    int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = (Math.PI) * Math.pow(radio,2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}
