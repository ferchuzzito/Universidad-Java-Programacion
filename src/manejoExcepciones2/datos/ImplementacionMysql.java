package manejoExcepciones2.datos;
import manejoExcepciones2.excepciones.*;

public class ImplementacionMysql implements AccesoDatos{

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {

         if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else {
             System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if (simularError) {
            throw new LecturaDatosEx("Error de lectura de datos");
        } else {
            System.out.println("Listar desde MySql");
        }
    }

    public boolean isSimularError() {
        return simularError;
    }

  
    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

}
