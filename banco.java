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
        System.out.println("HAHAHAHAHAHAHAHAHAHAHA");
        
    }
    
    public void hablar(){
        System.out.println("HAHAHAHAHAHAHAHAHAHAHA");
    }
    @Override 
    public void amar(){
        System.out.println("HAHAHAHAHAHAHAHAHAHAHA");
    }
    @Override
    public void odiar(){
        System.out.println("HAHAHAHAHAHAHAHAHAHAH");
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
class Banco{
    String nombre;
    String direccion;
    public void Saludar(){
       System.out.println("Buenas Tardes...");
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