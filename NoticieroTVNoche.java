package Noticiero;

public class NoticieroTVNoche extends NoticieroTV{
    public NoticieroTVNoche(String nombre, String conductor, String fecha) {
        super(nombre, conductor, fecha);
    }

    public NoticieroTVNoche(String nombre, String conductor) {
        super(nombre, conductor);
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
}
