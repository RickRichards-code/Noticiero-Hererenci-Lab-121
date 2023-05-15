package Noticiero;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\n===== a) crear un objeot NoticieroTVNoche con 4 noticias y un objeto NoticieroRadio con 6 noticias ====\n");
        NoticieroTVNoche N1 = new NoticieroTVNoche("Noticosas","Rocio","12-12-2000");
        NoticieroRadio R1 = new NoticieroRadio("Panamericano","Juan");
        N1.mostrar();
        R1.mostrar();

        // b)
        System.out.printf("\n==== b) Mostrar el nombre, condutor y fecha de cada Objeto, solo si tiene aguna noticia con el tituloX ====\n");
        System.out.printf(N1.tituloX("manianero"));

        // d)
        System.out.printf("\n \n==== d) Insertar una nueva noticia a cada objeto despues de la primera noticia ====\n");
        N1.insertarNoticiero("NuevoProgramaTV","4:00pm",42);
        R1.insertarNoticiero("ProgramNuevo","10:00pm",32);
        N1.mostrar();
        R1.mostrar();

    }
}