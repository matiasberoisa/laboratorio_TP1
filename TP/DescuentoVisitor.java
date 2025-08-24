public class DescuentoVisitor implements Visitor {

    public void visitExpress(Express unExpress) {
        if (unExpress.carga && unExpress.descarga) {
            unExpress.precio -= (unExpress.precio % 10);
        }
    }

    public void visitNacional(Nacional unNacional) {
        if (unNacional.canObjMax < 20) {
            unNacional.precio -= (unNacional.precio % 5);
        }
    }

    public void visitInternacional(Internacional unInternacional) {
        if (!unInternacional.aduana) {
            unInternacional.precio -= (unInternacional.precio % 15);
        }
    }
}
