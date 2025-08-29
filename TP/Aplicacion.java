import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Aplicacion {

    public static void main(String[] args) {
        Mudanza[] lasMudanzas = new Mudanza[3];

        // creo mudanzas
        // Mudanza Express
        Express express = new Express(
                "Buenos Aires",
                "La Plata",
                1501,
                15000,
                new Date(),
                "Camión",
                true, // carga
                true // descarga
        );

        // Mudanza Internacional
        Internacional internacional = new Internacional("Rio Negro", "Santiago de Chile", 1400, 120000, new Date(),
                "Avión", true, 25000);

        // Mudanza Nacional
        Nacional nacional = new Nacional("Córdoba", "Mendoza", 700, 45000, new Date(), "Camion", 50);

        lasMudanzas[0] = express;
        lasMudanzas[1] = internacional;
        lasMudanzas[2] = nacional;

        DescuentoVisitor visitorDescuento = new DescuentoVisitor();
        ImpuestosVisitor visitorImpuestos = new ImpuestosVisitor();
        for (Mudanza mudanza : lasMudanzas) {
            mudanza.accept(visitorDescuento);
            mudanza.accept(visitorImpuestos);
        }

        System.out.println("Mudanza Express - Precio Inicial: $" + express.getPrecio());
        System.out.println("Mudanza Nacional - Precio Inicial: $" + nacional.getPrecio());
        System.out.println("Mudanza Internacional - Precio Inicial: $" + internacional.getPrecio());
        System.out.println("-----------------------------------------------------");
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Aca hacemos las visitas de descuento:
        System.out.println("Visitas de descuento:");
        visitorDescuento.visitExpress(express);
        visitorDescuento.visitInternacional(internacional);
        visitorDescuento.visitNacional(nacional);
        System.out.println("Mudanza Express - Precio Final: $" + express.getPrecio());
        System.out.println("Mudanza Nacional - Precio Final: $" + nacional.getPrecio());
        System.out.println("Mudanza Internacional - Precio Final: $" + internacional.getPrecio());
        System.out.println();
        // Aca hacemos las visitas de impuestos:
        System.out.println("Visitas de impuestos:");
        visitorImpuestos.visitExpress(express);
        visitorImpuestos.visitInternacional(internacional);
        visitorImpuestos.visitNacional(nacional);
        System.out.println("Mudanza Express - Precio Final: $" + express.getPrecio());
        System.out.println("Mudanza Nacional - Precio Final: $" + nacional.getPrecio());
        System.out.println("Mudanza Internacional - Precio Final: $" + internacional.getPrecio());

        // Aca el metodo concurrente
        for (Mudanza mudanza : lasMudanzas) {
            Runnable tarea = () -> {
                System.out.println("Actualizando precios para " +
                        mudanza.getClass().getName());
                mudanza.setPrecio(mudanza.getPrecio() + (mudanza.getPrecio() * 0.1));
                System.out
                        .println("Mudanza " + mudanza.getClass().getName() + "- Precio Final: $" +
                                mudanza.getPrecio());
                System.out.println();

            };
            // esperamos 2 segundos y despues hacemos la 'tarea' cada 5s
            scheduler.scheduleWithFixedDelay(tarea, 0, 5, TimeUnit.SECONDS);
        }
    }
}
