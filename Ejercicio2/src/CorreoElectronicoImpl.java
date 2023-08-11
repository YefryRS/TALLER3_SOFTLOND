public class CorreoElectronicoImpl extends CorreoElectronico{

    public CorreoElectronicoImpl() {
    }

    public CorreoElectronicoImpl(String destinatario, String asunto, String mensaje) {
        super(destinatario, asunto, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("El correo electronico hacia: " + getDestinatario() + " con el asunto de: " + getAsunto() + " y el mensaje de: " + getMensaje() + ". Ha sido enviado exitosamente");
    }

}
