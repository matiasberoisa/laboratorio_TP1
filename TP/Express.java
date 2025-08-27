import java.util.Date;

public class Express extends Mudanza {
    private boolean carga, descarga;

    public Express(String origen, String destino, int km, int precio, Date horario, String tipoTransporte,
            boolean carga, boolean descarga) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.carga = carga;
        this.descarga = descarga;
    }

    public void calcularPrecio() {
        if (this.carga) {
            this.setPrecio(this.getPrecio() + (this.getPrecio() % 10));
        }
        if (this.descarga) {
            this.setPrecio(this.getPrecio() + (this.getPrecio() % 10));
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitExpress(this);
    }
    // setters y getters generados automaticamente

    public boolean isCarga() {
        return this.carga;
    }

    public boolean getCarga() {
        return this.carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public boolean isDescarga() {
        return this.descarga;
    }

    public boolean getDescarga() {
        return this.descarga;
    }

    public void setDescarga(boolean descarga) {
        this.descarga = descarga;
    }

}
