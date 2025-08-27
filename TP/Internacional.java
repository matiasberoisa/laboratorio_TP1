import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Internacional extends Mudanza {
    private boolean aduana;
    private int costoAduana;

    public ScheduledExecutorService getScheduler() {
        return this.scheduler;
    }

    private boolean tramiteAduana;

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public Internacional(String origen, String destino, int km, int precio, Date horario, String tipoTransporte,
            boolean aduana, int costoAduana) {
        super(origen, destino, km, precio, horario, tipoTransporte);
        this.aduana = aduana;
        this.costoAduana = costoAduana;
        this.tramiteAduana = false;
    }

    public void hacerTramitesAduana(int tiempoAduana) {
        if (!this.aduana) {
            System.out.println("Realizando tramites ...");

            scheduler.schedule(() -> {
                this.tramiteAduana = true;
                calcularPrecio(); 
                System.out.println("Tramites de aduana completos costo:$" + this.costoAduana);
            }, tiempoAduana, TimeUnit.SECONDS);
        }

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
