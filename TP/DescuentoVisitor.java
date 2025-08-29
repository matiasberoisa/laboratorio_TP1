public class DescuentoVisitor implements Visitor {

    public void visitExpress(Express unExpress) {
        if (unExpress.isCarga() && unExpress.isDescarga()) {
            double descuento = (unExpress.getPrecio() * 10) / 100;
            unExpress.setPrecio(unExpress.getPrecio() - descuento);
        }
    }

    public void visitNacional(Nacional unNacional) {
        if (unNacional.getCantObjetos() < unNacional.getCanObjMax()) {
            double descuento = unNacional.getPrecio() * 5 / 100;
            unNacional.setPrecio(unNacional.getPrecio() - descuento);
        }
    }

    public void visitInternacional(Internacional unInternacional) {
        if (!unInternacional.isAduana()) {
            double descuento = (unInternacional.getPrecio() * 15) / 100;
            unInternacional.setPrecio(unInternacional.getPrecio() - descuento);
        }
    }
}
