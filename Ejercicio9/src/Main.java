import java.util.ArrayList;
import java.util.List;

public class Main {
    /*9. Instrumentos musicales: Diseña una jerarquía de clases para instrumentos musicales, como guitarras, pianos y violines. Cada instrumento debe tener un método tocar() que imprima cómo suena. Luego, crea un método que acepte un arreglo de instrumentos y los haga tocar a todos utilizando polimorfismo.*/
    public static void main(String[] args) {
        List<InstrumentoMusical> instrumentosMusicales = new ArrayList<>();
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();
        Violin violin = new Violin();

        instrumentosMusicales.add(guitarra);
        instrumentosMusicales.add(piano);
        instrumentosMusicales.add(violin);

        for (InstrumentoMusical instrumentoMusical:instrumentosMusicales) {
            instrumentoMusical.tocar();
        }

    }
}