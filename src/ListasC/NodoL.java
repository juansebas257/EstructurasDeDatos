/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasC;

/**
 *
 * @author JuanCamilo
 */
public class NodoL {
    int Info;
    NodoL sig, ant;

    public NodoL(int Info, NodoL sig, NodoL ant) {
        this.Info = Info;
        this.sig = sig;
        this.ant = ant;
    }

    NodoL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    NodoL(int numero, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getInfo() {
        return Info;
    }

    public void setInfo(int Info) {
        this.Info = Info;
    }

    public NodoL getsig() {
        return sig;
    }

    public void setsig(NodoL sig) {
        this.sig = sig;
    }
    
    public NodoL getant() {
        return ant;
    }

    public void setant(NodoL ant) {
        this.ant = ant;
    }
    
    
}
