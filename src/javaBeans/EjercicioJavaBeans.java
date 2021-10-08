package javaBeans;
import javaBeans.bean.PersonaBean;

public class EjercicioJavaBeans {

	public static void main(String[] args) {

	        PersonaBean bean = new PersonaBean();
	        bean.setNombre("Juan");
	        bean.setEdad(29);
	        
	        System.out.println("Nombre:" + bean.getNombre());
	        System.out.println("Edad:" + bean.getEdad());
	    }
	}
