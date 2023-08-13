public class LibroFinanzas extends Libros implements Productos{

    private double precio;
    private double envio;
    private int cantidadPaginas;
    private String autor;
    private String lanzamiento;

    public LibroFinanzas(double precio, double envio, int cantidadPaginas, String autor, String lanzamiento) {
        this.precio = precio;
        this.envio = envio;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.lanzamiento = lanzamiento;
    }

    @Override
    public void visualizarPrimerasPaginas() {
        System.out.println("tendras acceso a las primeras 10 paginas");
    }

    @Override
    public void mostrarCopias() {
        System.out.println("Hay un total de 5000 copias");
    }

    @Override
    public double calcularPrecio() {
        double total = precio + envio;
        return total;
    }

    @Override
    public String mostrarDetalles() {
        return "cantidad paginas: " + cantidadPaginas + ", autor: " + autor + ", lanzamiento: " + lanzamiento;
    }
}
