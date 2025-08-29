import java.util.Date;

public class Nacional extends Mudanza {
    private int canObjMax;
    private int cantObjetos;

    public Nacional(String origen, String destino, int km, double precio, Date horario, String tipoTransporte,
            int canObjMax) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.canObjMax = canObjMax;
        this.cantObjetos = 0;
    }

    public void cargarObjetos(int cantidad) {
        cantObjetos = cantidad;
        if (cantObjetos > canObjMax) {
            this.setPrecio(this.getPrecio() + (this.getPrecio() / 10));
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitNacional(this);
    }
    // setters y getters generados automaticamente

    public int getCanObjMax() {
        return this.canObjMax;
    }

    public int getCantObjetos() {
        return cantObjetos;
    }

    public void setCanObjMax(int canObjMax) {
        this.canObjMax = canObjMax;
    }

}
