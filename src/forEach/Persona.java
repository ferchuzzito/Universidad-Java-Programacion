package forEach;

public class Persona {
	@SuppressWarnings("unused")
	private final int idPersona;
    private String nombre;

    private static int contadorPersonas;
    
    Persona(String nombre){
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
