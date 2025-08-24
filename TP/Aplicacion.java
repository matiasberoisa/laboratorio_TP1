import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Aplicacion {

    public static void main(String[] args) {
        Mudanza[] lasMudanzas = new Mudanza[3];

        // creo mudanzas
        // Mudanza Express
        Mudanza express = new Express(
                "Buenos Aires",
                "La Plata",
                60,
                15000,
                new Date(),
                "Camión",
                true, // carga
                false // descarga
        );

        // Mudanza Internacional
        Mudanza internacional = new Internacional("Rio Negro", "Santiago de Chile", 1400, 120000, new Date(),
                "Avión", true, 25000);

        // Mudanza Nacional
        Mudanza nacional = new Nacional("Córdoba", "Mendoza", 700, 45000, new Date(), "Camion", 50);

        lasMudanzas[0] = express;
        lasMudanzas[1] = internacional;
        lasMudanzas[2] = nacional;

        DescuentoVisitor visitorDescuento = new DescuentoVisitor();
        for (Mudanza mudanza : lasMudanzas) {
            mudanza.accept(visitorDescuento);
        }

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable tarea = () -> {
            System.out.println("la tarea es el cambio de precio");
            double nPrecio = 0.2; // lo que quiero actualizar
            for (Mudanza mudanza : lasMudanzas) {
                System.out.println("en la mudanza " + mudanza.origen + " el precio era: " + mudanza.precio);
                mudanza.actualizarPrecio(nPrecio);
            }

        };
        scheduler.scheduleAtFixedRate(tarea, 5, 10, TimeUnit.SECONDS);
    }

}
