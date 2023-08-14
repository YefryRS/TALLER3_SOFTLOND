public class CartaPoker implements Carta {
    private String palo;
    private String valor;

    public CartaPoker(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String mostrarCarta() {
        return valor + " de " + palo;
    }

    public int valorNumerico() {
        return valor.equals("A") ? 14 : valor.equals("K") ? 13 : valor.equals("Q") ? 12 : valor.equals("J") ? 11 : Integer.parseInt(valor);
    }
}
