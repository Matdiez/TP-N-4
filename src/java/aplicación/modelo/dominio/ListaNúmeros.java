package aplicación.modelo.dominio;

import java.util.ArrayList;

public class ListaNúmeros {
    
    private ArrayList<Integer> listaNúmeros;

    public ListaNúmeros() {
        listaNúmeros = new ArrayList();
    }

    public ListaNúmeros(ArrayList<Integer> listaNúmeros) {
        this.listaNúmeros = listaNúmeros;
    }

    /**
     * @return the listaNúmeros
     */
    public ArrayList<Integer> getListaNúmeros() {
        return listaNúmeros;
    }

    /**
     * @param listaNúmeros the listaNúmeros to set
     */
    public void setListaNúmeros(ArrayList<Integer> listaNúmeros) {
        this.listaNúmeros = listaNúmeros;
    }
    
}
