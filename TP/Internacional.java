import java.util.Date;

public class Internacional extends Mudanza {
    private boolean aduana;
    private int costoAduana;
    private boolean tramiteAduana;

    public Internacional(String origen, String destino, int km, double precio, Date horario, String tipoTransporte,
            boolean aduana, int costoAduana) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.aduana = aduana;
        this.costoAduana = costoAduana;
        this.tramiteAduana = false;
    }

    // setters y getters generador automaticamente
    public void calcularPrecio() {
        if (this.aduana)
            this.setPrecio(costoAduana + this.getPrecio());
    }

    public void accept(Visitor visitor) {
        visitor.visitInternacional(this);
    }

    public boolean isAduana() {
        return this.aduana;
    }

    public boolean getAduana() {
        return this.aduana;
    }

    public void setAduana(boolean aduana) {
        this.aduana = aduana;
    }

    public int getCostoAduana() {
        return this.costoAduana;
    }

    public void setCostoAduana(int costoAduana) {
        this.costoAduana = costoAduana;
    }

    public boolean isTramiteAduana() {
        return this.tramiteAduana;
    }

    public boolean getTramiteAduana() {
        return this.tramiteAduana;
    }

    public void setTramiteAduana(boolean tramiteAduana) {
        this.tramiteAduana = tramiteAduana;
    }

}
