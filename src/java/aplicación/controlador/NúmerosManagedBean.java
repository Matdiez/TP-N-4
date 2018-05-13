package aplicación.controlador;

import aplicación.modelo.dominio.ListaNúmeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class NúmerosManagedBean implements Serializable {

    private int num;
    private int may;
    private int men;
    private double prom;
    private ListaNúmeros listadoNúmeros;
    
    public NúmerosManagedBean() {
        listadoNúmeros = new ListaNúmeros();
    }

    public void agregarNúmero() {
        getListadoNúmeros().getListaNúmeros().add(getNum());
    }
    
    public int calcularMayor() {
        setMay(getListadoNúmeros().getListaNúmeros().get(0));
        for (int i=0;i<getListadoNúmeros().getListaNúmeros().size();i++) {
            if (getListadoNúmeros().getListaNúmeros().get(i)>may) {
                setMay(getListadoNúmeros().getListaNúmeros().get(i));
            }
        }
        return may;
    }
    
    public int calcularMenor() {
        setMen(getListadoNúmeros().getListaNúmeros().get(0));
        for (int i=0;i<getListadoNúmeros().getListaNúmeros().size();i++) {
            if (getListadoNúmeros().getListaNúmeros().get(i)<men) {
                setMen(getListadoNúmeros().getListaNúmeros().get(i));
            }
        }
        return men;
    }
    
    public double calcularPromedio() {
        double promedio;
        double suma = 0;
        for (int i=0;i<getListadoNúmeros().getListaNúmeros().size();i++) {
            suma = suma + getListadoNúmeros().getListaNúmeros().get(i);
        }
        setProm(suma/getListadoNúmeros().getListaNúmeros().size());
        return prom;
    }
    
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the may
     */
    public int getMay() {
        return may;
    }

    /**
     * @param may the may to set
     */
    public void setMay(int may) {
        this.may = may;
    }

    /**
     * @return the men
     */
    public int getMen() {
        return men;
    }

    /**
     * @param men the men to set
     */
    public void setMen(int men) {
        this.men = men;
    }

    /**
     * @return the prom
     */
    public double getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(double prom) {
        this.prom = prom;
    }

    /**
     * @return the listaNúmeros
     */
    public ListaNúmeros getListadoNúmeros() {
        return listadoNúmeros;
    }

    /**
     * @param listaNúmeros the listaNúmeros to set
     */
    public void setListadoNúmeros(ListaNúmeros listaNúmeros) {
        this.listadoNúmeros = listaNúmeros;
    }
    
}
