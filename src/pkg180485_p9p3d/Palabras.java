package pkg180485_p9p3d;

public enum Palabras {
    palabra1("laptop"),
    palabra2("maceta"),
    palabra3("rana"),
    palabra4("pulsera");
    
    private final String palabra;

    private Palabras(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }
    
}
