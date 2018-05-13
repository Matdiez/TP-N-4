package aplicación.modelo.datos;

import aplicación.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;

public class ColecciónLibros implements Serializable {
    
    private ArrayList<Libro> libros;

    public ColecciónLibros() {
        libros = new ArrayList();
    }
    
    public void agregarLibros(Libro unLibro) {
        getLibros().add(unLibro);
    }
    
    public void modificarLibros(Libro unLibro) {
        for (Libro a : libros) {
            if (a.getIsbn().equals(unLibro.getIsbn())) {
                getLibros().set(libros.indexOf(a), unLibro);
                break;
            }
        }
    }
    
    public void eliminarLibros(Libro unLibro) {
        for (Libro a : libros) {
            if (a.getIsbn().equals(unLibro.getIsbn())) {
                libros.remove(libros.indexOf(a));
                break;
            }
        }
    }

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
}