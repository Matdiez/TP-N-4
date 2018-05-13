package aplicación.modelo.datos;

import aplicación.modelo.dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;

public class ColecciónAutos implements Serializable {
    
    private ArrayList<Auto> autos;

    public ColecciónAutos() {
        autos = new ArrayList();
    }

    public void agregarAutos(Auto unAuto) {
        getAutos().add(unAuto);
    }
    
    public void modificarAutos(Auto unAuto) {
        for (Auto a : getAutos()) {
            if (a.getPatente().equals(unAuto.getPatente())) {
                getAutos().set(getAutos().indexOf(a), unAuto);
                break;
            }
        }
    }
    
    public void eliminarAutos(Auto unAuto) {
        for (Auto a : autos) {
            if (a.getPatente().equals(unAuto.getPatente())) {
                autos.remove(autos.indexOf(a));
                break;
            }
        }
    }
    
    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
    
}
