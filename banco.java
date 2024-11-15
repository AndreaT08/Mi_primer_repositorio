interface Sentimiento{
        void amar();
        void odiar();

    }
class Persona implements Sentimiento {
    String nombres;
    int edad;
    String apellidos;
    boolean genero;
    char sexo;
    

    persona(String nombres, int edad, String apellidos, boolean genero, char sexo){
        this.nombres = nombres;
        this.edad = edad;
        this.apellidos = apellidos;
        this.genero=genero;
        this.genero=genero;
        this.sexo=sexo;
    }
    public void correr(){
        System.out.println("Estor corriendo...");
        
    }
    
    public void hablar(){
        System.out.println("Estoy hablando...");
    }
    @Override 
    public void amar(){
        System.out.println("Estoy amando con todo el alma...");
    }
    @Override
    public void odiar(){
        System.out.println("Estoy odiando con todo mi ser...");
    }}


class Cuenta {
    double saldo;
    void cargar(double cantidad) {
        saldo=saldo - cantidad;
        
    }
    void abonar(double cantidad) {
        saldo=saldo + cantidad;
        
    }
}
class Clientes extends persona{
    int numero;
    Clientes(String nombres, int edad, String apellidos, boolean genero, char sexo){
        super(nombres, edad, apellidos, genero, sexo);
    }
}

class Programa{
    public static void main (String[] args){
        System.out.println("Welcome to tech bank");
    }
}