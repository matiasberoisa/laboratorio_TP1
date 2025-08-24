import java.util.Date;

public class Express extends Mudanza {
    boolean carga, descarga;

    public Express(String origen, String destino, int km, int precio, Date horario, String tipoTransporte,
            boolean carga, boolean descarga) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.carga = carga;
        this.descarga = descarga;
    }

    public void calcularPrecio() {
        if (this.carga) {
            this.precio += this.precio / 100;
        }
        if (this.descarga) {
            this.precio += this.precio / 100;
        }
    }

    public void aceptarVisitante(Visitante unVisitante) {
        unVisitante.visitarExpress(this);
    }

}
