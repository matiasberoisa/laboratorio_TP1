public class Aplicacion {
    Mudanza[] lasMudanzas = new Mudanza[3];

    public void exportarVisitante() {
        DescuentoVisitor visitorDescuento = new DescuentoVisitor();

        for (int i = 0; i < lasMudanzas.length; i++) {
            lasMudanzas[i].accept(visitorDescuento);
        }
    }
}
