package aplicación.controlador;

import aplicación.modelo.datos.ColecciónAutos;
import aplicación.modelo.dominio.Auto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable {
    
    private Auto auto;
    private ColecciónAutos colecciónAutos;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
        
    public AutoFormBean() {
        colecciónAutos = new ColecciónAutos();
    }
    
    public void agregarAuto() {
        setAuto(new Auto(getPatente(),getMarca(),getModelo(),getColor(),getCombustible()));
        getColecciónAutos().agregarAutos(getAuto());
    }
    
    public void establecerAuto(Auto unAuto) {
        setAuto(unAuto);
    }
    
    public void modificarAuto() {
        getColecciónAutos().modificarAutos(getAuto());
    }

    public void elimiarAuto() {
        getColecciónAutos().eliminarAutos(getAuto());
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the colecciónAutos
     */
    public ColecciónAutos getColecciónAutos() {
        return colecciónAutos;
    }

    /**
     * @param colecciónAutos the colecciónAutos to set
     */
    public void setColecciónAutos(ColecciónAutos colecciónAutos) {
        this.colecciónAutos = colecciónAutos;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}