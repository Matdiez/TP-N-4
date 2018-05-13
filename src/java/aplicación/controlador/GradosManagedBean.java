package aplicación.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class GradosManagedBean {

    private double graC;
    private double graF;
    private double graK;
    
    public GradosManagedBean() {
    }

    public void convertirGradosF() {
        setGraF((getGraC()*1.8) + 32);
    }
    
    public void convertirGradosK() {
        setGraK(getGraC() + 273.15);
    }
    
    /**
     * @return the graC
     */
    public double getGraC() {
        return graC;
    }

    /**
     * @param graC the graC to set
     */
    public void setGraC(double graC) {
        this.graC = graC;
    }

    /**
     * @return the graF
     */
    public double getGraF() {
        return graF;
    }

    /**
     * @param graF the graF to set
     */
    public void setGraF(double graF) {
        this.graF = graF;
    }

    /**
     * @return the graK
     */
    public double getGraK() {
        return graK;
    }

    /**
     * @param graK the graK to set
     */
    public void setGraK(double graK) {
        this.graK = graK;
    }
    
}
