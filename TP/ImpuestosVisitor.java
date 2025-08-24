public class ImpuestosVisitor implements Visitor {

    public void visitExpress(Express unExpress) {
        if (unExpress.carga && unExpress.descarga) {
            unExpress.precio += (unExpress.precio % 20);
        }
    }

    public void visitNacional(Nacional unNacional) {
        if (unNacional.km > 2000) {
            unNacional.precio += (unNacional.precio % 5);
        }
    }

    public void visitInternacional(Internacional unInternacional) {
        if (!unInternacional.aduana) {
            unInternacional.precio += (unInternacional.costoAduana % 50);
        }
    }
}
