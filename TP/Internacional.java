import java.util.Date;

public class Internacional extends Mudanza {

    public Internacional(String origen, String destino, int km, int precio, Date horario) {
        super(origen, destino, km, precio, horario);

    }

    public void aceptarVisitante(Visitante unVisitante) {
        unVisitante.visitarInternacional(this);
    }
}
