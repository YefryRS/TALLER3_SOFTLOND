public class Main {
    /*
    1. Figuras geométricas: Crea una jerarquía de clases que representan diferentes figuras geométricas, como círculos, triángulos y cuadrados. Utiliza una interfaz para definir métodos comunes como cálculo de área y perímetro. Cada figura debe tener su propia implementación de estos métodos.
    */
    public static void main(String[] args) {

        // Circulo
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        //Triangulo
        Triangulo triangulo = new Triangulo(10,10,5,5,5);
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());

        //Cuadrado
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println(cuadrado.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
    }
}