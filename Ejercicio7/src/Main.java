import java.util.ArrayList;
import java.util.List;

public class Main {
    /*7. Formas geométricas y áreas: Utiliza la jerarquía de clases de formas geométricas que creaste en el ejercicio anterior (con interfaces y clases abstractas). Agrega un método calcularArea() a la interfaz de las formas y luego implementa este método en las clases concretas. Crea un array de formas y calcula el área de cada una utilizando polimorfismo.*/
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        Circulo circulo = new Circulo(2);
        Cuadrado cuadrado = new Cuadrado(2);
        Triangulo triangulo = new Triangulo(2,5,5,3,6);

        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(triangulo);

        for (Figura figura:figuras) {
            System.out.println("el area de la figura " + figura.getClass().getName() + " es de: " + figura.calcularArea());
        }
    }
}