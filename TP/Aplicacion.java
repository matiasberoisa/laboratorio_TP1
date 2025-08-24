public class Aplicacion {
    Mudanza[] lasMudanzas = new Mudanza[3];

    public void exportarVisitante() {
        VisitanteXML unVisitante = new VisitanteXML();

        for (int i = 0; i < lasMudanzas.length; i++) {
            lasMudanzas[i].aceptarVisitante(unVisitante);
        }
    }
}
