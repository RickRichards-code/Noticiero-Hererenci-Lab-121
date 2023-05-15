package Noticiero;

public class NoticieroTV extends Noticiero{
    public NoticieroTV(String nombre, String conductor, String fecha) {
        super(nombre, conductor, fecha);
    }

    public NoticieroTV(String nombre, String conductor) {
        super(nombre, conductor);
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
}
