package ClasesYMetodos;

/**
 *
 * @author Lesly Marcela Cardenas Avila
 */
public class JugadorFutbol {
    
    //Atributos
    String nombre;
    int edad;
    double altura;
    double peso;
    String nacionalidad;
    String equipo;
    String posicion;
    int numeroCamiseta;
    double velocidad;
    double fuerza;
    
    
    
    //Metodos
    
    //Metodo constructor
    public JugadorFutbol(String nombre,int edad,double altura,double peso,String nacionalidad,
                         String equipo,String posicion,int numeroCamiseta,double velocidad,double fuerza){
        this.nombre=nombre;
        this.edad =edad;
        this.altura =altura;
        this.peso=peso;
        this.nacionalidad=nacionalidad;
        this.equipo=equipo;
        this.posicion=posicion;
        this.numeroCamiseta=numeroCamiseta;
        this.velocidad=velocidad;
        this.fuerza=fuerza;
        
    }
 
    
    
    public double correr(double velocidad){
        System.out.println("El jugador " + nombre + " esta corriendo a "+ velocidad + " km/h");
    return velocidad;
    }
    
    public void cabecear(){
        System.out.println("El jugador " + nombre + " salta y cabecea el balon");
    }
    
    public String pasarElBalon(String receptor){
        System.out.println("El jugador " + nombre +" en la posicion de "+ posicion +" le pasa el balon a " + receptor);
    return receptor;
    }
    
    public double patearBalon(double fuerza){
        System.out.println("El jugador "+ nombre + " patea el balon con una fuerza de "+ fuerza);
    return fuerza;
    }
    
    public String disparoPorteria(String direccion){
        System.out.println("El jugador " + nombre + " dispara el balon hacia "+ direccion);
    return direccion;
    }
    
    public void anotarGol(){
        System.out.println("El jugador " + nombre +" con el numero de camiseta " + numeroCamiseta +
                            " anoto un gol para su equipo " + equipo);
    }
       
}
