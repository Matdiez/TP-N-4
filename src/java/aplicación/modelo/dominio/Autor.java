package aplicación.modelo.dominio;

public class Autor {
    
    private String nom;
    private String ape;
    private String DNI;

    public Autor() {
    }

    public Autor(String nom, String ape, String DNI) {
        this.nom = nom;
        this.ape = ape;
        this.DNI = DNI;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the ape
     */
    public String getApe() {
        return ape;
    }

    /**
     * @param ape the ape to set
     */
    public void setApe(String ape) {
        this.ape = ape;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}
