public class Triangulo implements Figura{

    int base;
    int altura;
    int lado1, lado2, lado3;

    public Triangulo() {
    }

    public Triangulo(int base, int altura, int lado1, int lado2, int lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
}
