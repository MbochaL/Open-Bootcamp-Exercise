public class Main {
    public static void main(String[] args) {

        coche miCoche = new coche();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puerta);

    }
}

class coche {
    public int puerta = 0;

    public void SumarPuerta(){

        this.puerta ++;
    }
}