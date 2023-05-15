package Noticiero;

public class NoticieroRadio extends Noticiero{
    public NoticieroRadio(String nombre, String conductor, String fecha) {
        super(nombre, conductor, fecha);
    }

    public NoticieroRadio(String nombre, String conductor) {
        super(nombre, conductor);
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
}
