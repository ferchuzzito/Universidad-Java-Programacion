package entradaDatosCalculadora;
import java.util.*;
import static entradaDatosCalculadora.calculadora.Operaciones.sumar;

public class EjercicioEntradaDatosCalculadora {

	public static void main(String[] args) {
		System.out.println("Proporciona el primer valor:");
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Proporciona el segundo valor:");
        int b = scan.nextInt();
        int resultado = sumar(a, b);
        System.out.println("El resultado de la suma es: " + resultado);
	}

}
