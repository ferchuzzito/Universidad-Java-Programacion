package entradaDatosScanner;
import java.util.*;
public class EjercicioEntradaDatosScanner {

	public static void main(String[] args) {
        String captura = null;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un dato:");
        captura = scan.nextLine();
        while (captura != null) {
            System.out.println("Dato introducido :" + captura);
            captura = scan.nextLine();;
        }
	}

}
