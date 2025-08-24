public class Aplicacion {
    Mudanza[] lasMudanzas = new Mudanza[3];

    public void exportarVisitante() {
        ImpuestosVisitor visitorDescuento = new ImpuestosVisitor();

        for (int i = 0; i < lasMudanzas.length; i++) {
            lasMudanzas[i].accept(visitorDescuento);
        }
    }
}
