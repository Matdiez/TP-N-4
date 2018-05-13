package aplicación.controlador;

import aplicación.modelo.datos.ColecciónLibros;
import aplicación.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable {

    private ColecciónLibros libros;
    private Autor autor;
    private ArrayList<Autor> autores;
    
    public LibroFormBean() {
        libros = new ColecciónLibros();
        autores = new ArrayList();
        autores.add(new Autor("Mark","Dalek","42452902"));
        autores.add(new Autor("Jack","Miller","49239209"));
        autores.add(new Autor("Adam","Lake","41561801"));
    }

    /**
     * @return the libros
     */
    public ColecciónLibros getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ColecciónLibros libros) {
        this.libros = libros;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return the autores
     */
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
}
