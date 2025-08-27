
import java.util.Date;

public abstract class Mudanza {
    private String origen, destino;
    private int km, precio;
    private Date horario;
    private String tipoTransporte;

    public void accept(Visitor visitor) {

    }

    public Mudanza(String origen, String destino, int km, int precio, Date horario, String tipoTransporte) {
        this.origen = origen;
        this.destino = destino;
        this.km = km;
        this.precio = precio;
        this.horario = horario;
        this.tipoTransporte = tipoTransporte;
    }

    public void calcularPrecio() {

    }

    // getters and setters generados automaticamente

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getHorario() {
        return this.horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getTipoTransporte() {
        return this.tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

}
