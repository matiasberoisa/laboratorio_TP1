import java.util.Date;

public class Nacional extends Mudanza {

    public Nacional(String origen, String destino, int km, int precio, Date horario) {
        super(origen, destino, km, precio, horario);

    }

    public void aceptarVisitante(Visitante unVisitante) {
        unVisitante.visitarNacional(this);
    }
}
