import java.util.Date;

public class Internacional extends Mudanza {
    boolean aduana;
    int costoAduana;

    public Internacional(String origen, String destino, int km, int precio, Date horario, String tipoTransporte,
            boolean aduana, int costoAduana) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.aduana = aduana;
        this.costoAduana = costoAduana;
    }

    public void calcularPrecio() {
        if (this.aduana)
            this.precio += costoAduana;
    }

    public void aceptarVisitante(Visitante unVisitante) {
        unVisitante.visitarInternacional(this);
    }
}
