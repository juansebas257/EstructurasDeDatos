
import java.time.temporal.Temporal;

public class ListaEnlazada {

    Nodo1 Primero;

    public ListaEnlazada() {
        Primero = null;
    }

    public boolean vacia() {
        if (Primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarDato(int Dato) {
        Nodo1 Temporal = new Nodo1(Dato);
        Temporal.Siguiente = Primero;
        Primero = Temporal;
    }

    public String Listar() {
        String info = "";
        Nodo1 Aux = Primero;

        while (Aux != null) {
            info += "{" + Aux.dato + "}";
            Aux = Aux.Siguiente;

        }
        return info;
    }
     
    public void BorrarPosicion(int pos)
    {
        Nodo1 Anterior = Primero;
        Nodo1 Actual = Primero;
        int k=0;
        if(pos>0)
        {
            while(k !=pos && Actual.Siguiente !=null)
            {
                Anterior=Actual;
                Actual= Actual.Siguiente;
                k++;
                        
            }
            Anterior.Siguiente=Actual.Siguiente;
            
        }
        
    }
    
    public void BorrarUltimo()
    {
        Nodo1 Anterior=Primero;
        Nodo1 Actual=Primero;
        while (Actual.Siguiente !=null)
        {
            Anterior = Actual;
            Actual = Actual.Siguiente;
        }
        Anterior.Siguiente = null;                
    }
    
}
