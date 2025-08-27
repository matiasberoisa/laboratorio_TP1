import java.util.Date;

public class Nacional extends Mudanza {
    private int canObjMax;

    public Nacional(String origen, String destino, int km, int precio, Date horario, String tipoTransporte,
            int canObjMax) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.canObjMax = canObjMax;

    }

    public void calcularPrecio(int cantObjetos) {
        if (cantObjetos > this.canObjMax) {
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

    public void setCanObjMax(int canObjMax) {
        this.canObjMax = canObjMax;
    }

}
