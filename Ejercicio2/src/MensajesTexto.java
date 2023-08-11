import java.util.Optional;

abstract public class MensajesTexto implements Notificacion{

    private int numeroDdestinatario;
    private String contenido;
    private String prioridad;
    private String remitente;

    public MensajesTexto() {
    }

    public MensajesTexto(int numeroDdestinatario, String contenido, String prioridad, String remitente) {
        this.numeroDdestinatario = numeroDdestinatario;
        this.contenido = contenido;
        this.prioridad = prioridad;
        this.remitente = remitente;
    }

    public int getNumeroDdestinatario() {
        return numeroDdestinatario;
    }

    public void setNumeroDdestinatario(int numeroDdestinatario) {
        this.numeroDdestinatario = numeroDdestinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public void enviar() {

    }
}
