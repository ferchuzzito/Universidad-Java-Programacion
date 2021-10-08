package manejoExcepciones1.domain;
/**
*
* @author Fernando Leon
*/
@SuppressWarnings("serial")
public class OperationException extends Exception {

   public OperationException(String mensaje) {
       //Inicializamos el mensaje de error de la clase padre
       super(mensaje);
   }
}
