import java.util.Date;

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
        //Queda aplicar metodos del otro visitor y hacer ejemplos 
    }

}
//ejemplo
        // // Creamos mudanza internacional con aduana
        // Internacional mudanzaInt = new Internacional(
        //         "Neuquén", "Santiago de Chile",
        //         800,        // km
        //         50000,      // precio base
        //         new Date(),
        //         "Camión",
        //         true,       // requiere aduana
        //         15000       // costo aduana
        // );

        // System.out.println("Precio inicial: $" + mudanzaInt.getPrecio());

        // // Simular trámites de aduana que tardan 5 seg
        // mudanzaInt.hacerTramitesAduana(5);

        // try {
        //     Thread.sleep(7000); // esperar lo suficiente para que se ejecute el scheduler
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }