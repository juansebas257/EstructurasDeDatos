
package ArbolesBTS;


public class PanelArboles {
int dato;
    PanelArboles Izquierdo;
    PanelArboles Derecho;


public PanelArboles(int d){
    this.dato = d;
    this.Izquierdo = null;
    this.Derecho = null;
}

public String toString(){
    return " "+ dato;
}
  
}
