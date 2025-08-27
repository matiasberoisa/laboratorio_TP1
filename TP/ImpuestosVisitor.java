public class ImpuestosVisitor implements Visitor {

    public void visitExpress(Express unExpress) {
        if (unExpress.isCarga() && unExpress.isDescarga()) {
            unExpress.setPrecio(unExpress.getPrecio() + (unExpress.getPrecio() % 20));
        }
    }

    public void visitNacional(Nacional unNacional) {
        if (unNacional.getKm() > 2000) {
            unNacional.setPrecio(unNacional.getPrecio() + (unNacional.getPrecio() % 5));
        }
    }

    public void visitInternacional(Internacional unInternacional) {
        if (!unInternacional.isAduana()) {
            unInternacional.setPrecio(unInternacional.getPrecio() + (unInternacional.getPrecio() % 10));
        }
    }
}
