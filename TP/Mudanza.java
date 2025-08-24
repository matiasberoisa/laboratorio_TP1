
import java.util.Date;

public abstract class Mudanza {
    String origen, desitno;
    int km, precio;
    Date horario;

    public Mudanza(String origen, String destino, int km, int precio, Date horario) {
        this.origen = origen;
        this.desitno = destino;
        this.km = km;
        this.precio = precio;
        this.horario = horario;
    }

    public void calcularKm(int kmRecorrido) {
        this.km += kmRecorrido;
    }

    public void aceptarVisitante(Visitante unVisitante) {

    }

}
