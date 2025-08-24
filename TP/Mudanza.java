
import java.util.Date;

public abstract class Mudanza {
    String origen, desitno;
    int km, precio;
    Date horario;
    String tipoTransporte;

    public void accept(Visitor visitor) {

    }

    public Mudanza(String origen, String destino, int km, int precio, Date horario, String tipoTransporte) {
        this.origen = origen;
        this.desitno = destino;
        this.km = km;
        this.precio = precio;
        this.horario = horario;
        this.tipoTransporte = tipoTransporte;
    }

    public void calcularPrecio() {

    }

}
