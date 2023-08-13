public class Main {
    /*5. Tienda en línea: Construye un sistema básico para una tienda en línea. Crea una interfaz para representar productos y métodos como calcularPrecio y mostrarDetalles. Luego, implementa clases abstractas para diferentes categorías de productos (electrónica, ropa, libros, etc.) y clases concretas para productos específicos en cada categoría.*/
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung",2020,"rojo",750000,50000);
        celular.accesoriosAdicionales();
        celular.garantiaPorImprevistos();
        System.out.println(celular.mostrarDetalles());
        System.out.println(celular.calcularPrecio());

        System.out.println("-------------------------------------------");

        Pantalones pantalones = new Pantalones(50000,10000,"negro",30,"cuero");
        pantalones.unidades();
        pantalones.descuentosEspeciales();
        System.out.println(pantalones.mostrarDetalles());
        System.out.println(pantalones.calcularPrecio());

        System.out.println("-------------------------------------------");

        LibroFinanzas libroFinanzas = new LibroFinanzas(60000,15000,200,"Pepito Suarez","01/08/2023");
        libroFinanzas.mostrarCopias();
        libroFinanzas.visualizarPrimerasPaginas();
        System.out.println(libroFinanzas.mostrarDetalles());
        System.out.println(libroFinanzas.calcularPrecio());

    }
}