import java.util.Date;

public class Aplicacion {

    public static void main(String[] args) {
        Mudanza[] lasMudanzas = new Mudanza[3];

        // creo mudanzas
        // Mudanza Express
        Express express = new Express(
                "Buenos Aires",
                "La Plata",
                60,
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
 System.out.println("Mudanza Express - Precio Final: $" + express.getPrecio());
        DescuentoVisitor visitorDescuento = new DescuentoVisitor();
        for (Mudanza mudanza : lasMudanzas) {
            mudanza.accept(visitorDescuento);
        }

        ImpuestosVisitor visitorImpuestos = new ImpuestosVisitor();
        for (Mudanza mudanza : lasMudanzas) {
            mudanza.accept(visitorImpuestos);
        }
         System.out.println("Mudanza Express - Precio Final: $" + express.getPrecio());
        // visitorDescuento.visitExpress(express);
        // System.out.println("Mudanza Express con Descuento - Precio Final: $" + express.getPrecio());
    }

}
