public class DescuentoVisitor implements Visitor {

    public void visitExpress(Express unExpress) {
        if (unExpress.isCarga() && unExpress.isDescarga()) {
            unExpress.setPrecio(unExpress.getPrecio() - (unExpress.getPrecio() % 10));
        }
    }

    public void visitNacional(Nacional unNacional) {
        if (unNacional.getCanObjMax() < 20) {
            unNacional.setPrecio(unNacional.getPrecio() - (unNacional.getPrecio() % 5));
        }
    }

    public void visitInternacional(Internacional unInternacional) {
        if (!unInternacional.isAduana()) {
            unInternacional.setPrecio(unInternacional.getPrecio() - (unInternacional.getPrecio() % 15));
        }
    }
}
