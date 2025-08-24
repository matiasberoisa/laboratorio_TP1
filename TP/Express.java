import java.util.Date;

public class Express extends Mudanza {

    public Express(String origen, String destino, int km, int precio, Date horario) {
        super(origen, destino, km, precio, horario);

    }

    public void aceptarVisitante(Visitante unVisitante) {
        unVisitante.visitarExpress(this);
    }

}
