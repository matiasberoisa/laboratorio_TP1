public class ImpuestosVisitor implements Visitor {

    public void visitExpress(Express unExpress) {
        if (unExpress.getKm() > 1500) {
            double impuestos = (unExpress.getPrecio() * 5) / 100;
            unExpress.setPrecio(unExpress.getPrecio() + impuestos);
        }
    }

    public void visitNacional(Nacional unNacional) {
        if (unNacional.getKm() > 2000) {
            double impuestos = (unNacional.getPrecio() * 5) / 100;
            unNacional.setPrecio(unNacional.getPrecio() + impuestos);
        }
    }

    public void visitInternacional(Internacional unInternacional) {
        if (unInternacional.isAduana()) {
            double impuestos = (unInternacional.getPrecio() * 15) / 100;
            unInternacional.setPrecio(unInternacional.getPrecio() + impuestos);
        }
    }
}
