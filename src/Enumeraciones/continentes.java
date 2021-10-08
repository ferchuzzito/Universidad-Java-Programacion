package Enumeraciones;

public class continentes {
	public enum Continentes {

	    AFRICA(53),
	    EUROPA(46),
	    ASIA(44),
	    AMERICA(34),
	    OCEANIA(14);
	    
	    /**
	     * Atributo de cada elemento de una enumeracion
	     */
	    private final int paises;

	    /**
	     * Constructor de cada elemento de la enumeracion
	     * @param paises
	     */
	    Continentes(int paises) {
	        this.paises = paises;
	    }

	    public int getPaises() {
	        return paises;
	    }
	}
}
