package labFinal.Mx.com.gm.peliculas.excepciones;

@SuppressWarnings("serial")
public class AccesoDatosEx extends Exception{
    String mensaje;

    public AccesoDatosEx(String mensaje) {
        this.mensaje = mensaje;
    }
            
}
