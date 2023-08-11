import java.util.Optional;

public class MensajeTextoImpl extends MensajesTexto{

    public MensajeTextoImpl() {
    }

    public MensajeTextoImpl(int numeroDdestinatario, String contenido, String prioridad, String remitente) {
        super(numeroDdestinatario, contenido, prioridad, remitente);
    }

    @Override
    public void enviar() {
        System.out.println("La informacion del mensaje enviado es la siguiente:");
        System.out.println("numero: " + getNumeroDdestinatario());
        System.out.println("contenido: " + getContenido());
        System.out.println("prioridad: " + getPrioridad());
        System.out.println("remitente: " + getRemitente());
    }

}
