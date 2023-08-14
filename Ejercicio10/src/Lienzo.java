import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    List<Dibujable> dibujables = new ArrayList<>();
    Circulo circulo = new Circulo();
    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();

    public void getDibujables() {
        dibujables.add(circulo);
        dibujables.add(cuadrado);
        dibujables.add(rectangulo);

        for (Dibujable dibujable: dibujables) {
            dibujable.dibujar();
        }

    }
}
