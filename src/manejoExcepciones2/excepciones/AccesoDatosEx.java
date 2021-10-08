package manejoExcepciones2.excepciones;

@SuppressWarnings("serial")
public class AccesoDatosEx extends Exception{
    
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
}
