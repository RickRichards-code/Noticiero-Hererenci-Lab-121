package Noticiero;

public class Noticiero {
    private String nombre,conductor,fecha;
    private int nroNoticias;
    private String not[][] = new String[60][3];
    private int tiempo[] = new int[60];

    public Noticiero(String nombre, String conductor, String fecha) {
        this.nombre = nombre;
        this.conductor = conductor;
        this.fecha = fecha;
        this.nroNoticias = 4;
        this.not[0][0]="losSimpson";this.not[0][1]="8:00am";this.tiempo[0]=60;
        this.not[1][0]="NotiX";this.not[1][1]="2:00am";this.tiempo[1]=42;
        this.not[2][0]="manianero";this.not[2][1]="4:00am";this.tiempo[2]=41;
        this.not[3][0]="NotiX";this.not[3][1]="5:00am";this.tiempo[3]=621;
    }
    public Noticiero(String nombre, String conductor) {
        this.nombre = nombre;
        this.conductor = conductor;
        this.fecha = "13-12-2000";
        this.nroNoticias = 6;
        this.not[0][0]="Matutino";this.not[0][1]="8:00am";this.tiempo[0]=60;
        this.not[1][0]="NotiX";this.not[1][1]="2:00am";this.tiempo[1]=42;
        this.not[2][0]="manianero";this.not[2][1]="4:00am";this.tiempo[2]=41;
        this.not[3][0]="NotiX";this.not[3][1]="5:00am";this.tiempo[3]=621;
        this.not[4][0]="NotiY";this.not[4][1]="6:00am";this.tiempo[4]=53;
        this.not[5][0]="losSimpson";this.not[5][1]="7:00am";this.tiempo[5]=77;
    }
    public void mostrar(){
        System.out.printf("\n---- Noticiero ----\n");
        System.out.printf("nombre: "+nombre+"\nconductor: "+conductor+"\nfechga: "+fecha+"\nnroNoticias: "+nroNoticias+"\n");
        for (int i=0;i<nroNoticias;i++){
            System.out.printf("titulo: "+ not[i][0]+"  hora: "+not[i][1]+"  tiempo: "+tiempo[i]+"\n");
        }
    }
    // b)
    public String tituloX(String tituloX){
        for (int i=0;i<nroNoticias;i++){
//            System.out.printf("titulo: "+ not[i][0]+"  hora: "+not[i][1]+"  tiempo: "+tiempo[i]+"\n");
            if(not[i][0].equals(tituloX))
                return ("nombre: "+nombre+"  conductor: "+conductor+"   fecha:"+fecha);
        }
        return "no existe ese titulo";
    }
    // d)
    public void insertarNoticiero(String tituloX,String horaX, int tiempoX){
        not[1][0]=null;not[1][1]=null;tiempo[1]=0;

        for (int i = 1;i<nroNoticias+1;i++){
            String aux1, aux2;
            int aux3;
            aux1 = not[i+1][0]; aux2= not[i+1][1];aux3=tiempo[i+1];
            not[i+nroNoticias-1][0]=aux1;not[i+nroNoticias-1][1]= aux2;tiempo[i+nroNoticias-1]=aux3;
            not[i][0]=not[i+1][0];not[i][1]=not[i+1][1];tiempo[i]=tiempo[i+1];

        }
        nroNoticias++;
        not[1][0]=tituloX;not[1][1]=horaX;tiempo[1]=tiempoX;
    }
}
