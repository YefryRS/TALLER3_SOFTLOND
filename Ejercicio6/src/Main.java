import java.util.ArrayList;
import java.util.List;

public class Main {
    /*6. Animales y sonidos: Crea una jerarquía de clases que representen diferentes tipos de animales, como perros, gatos y pájaros. Cada clase de animal debe tener un método hacerSonido() que imprima el sonido característico del animal. Luego, crea un array de animales y recorre el array llamando al método hacerSonido() en cada uno. Esto demuestra cómo el polimorfismo permite tratar objetos de diferentes clases de manera uniforme.
    */
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();
        Gatos gatos = new Gatos();
        Pajaros pajaros = new Pajaros();
        Perros perros = new Perros();

        animales.add(gatos);
        animales.add(pajaros);
        animales.add(perros);

        for (Animal animal:animales) {
            animal.hacerSonido();
        }


    }
}