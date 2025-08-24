import java.util.Date;

public class Nacional extends Mudanza {
    int canObjMax;

    public Nacional(String origen, String destino, int km, int precio, Date horario, String tipoTransporte,
            int canObjMax) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.canObjMax = canObjMax;

    }

    public void calcularPrecio(int cantObjetos) {
        if (cantObjetos > this.canObjMax) {
            this.precio = this.precio + this.precio + (cantObjetos - this.canObjMax) / 100;
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitNacional(this);
    }
}
