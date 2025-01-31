package ClasesYMetodos;
/**
 *
 * @author Lesly Marcela Cardenas Avila
 */
public class Main {
    public static void main(String[] args){
        
        JugadorFutbol jugadorEjemplo = new JugadorFutbol("James Rodriguez",32,1.80,78.0,"Colombiano"
                                                        ,"Sao paulo F.C","centrocampista",55,40.0
                                                        ,90.0);
        
        
        double correr = jugadorEjemplo.correr(35.0);
        jugadorEjemplo.cabecear();
        String pasarElBalon = jugadorEjemplo.pasarElBalon("Andre Silva");
        double patearBalon = jugadorEjemplo.patearBalon(90.0);
        String disparoPorteria = jugadorEjemplo.disparoPorteria("la porteria");
        jugadorEjemplo.anotarGol();
        
    }
}
