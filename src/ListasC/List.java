package ListasC;
/**
 *
 * @author JuanCamilo
 */
public class List {

    int info;
    NodoL ant, sig;
    int tamannio=0;

    private NodoL raiz;

    public List() {
        raiz = null;
    }

    List(int numero, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertarPrimero(int x) {
        NodoL nuevo = new NodoL();
        nuevo.Info = x;
        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            NodoL ultimo = raiz.ant;
            nuevo.sig = raiz;
            nuevo.ant = ultimo;
            raiz.ant = nuevo;
            ultimo.sig = nuevo;
            raiz = nuevo;
        }
    }

    public void insertarUltimo(int x) {
        NodoL nuevo = new NodoL();
        nuevo.Info = x;
        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            NodoL ultimo = raiz.ant;
            nuevo.sig = raiz;
            nuevo.ant = ultimo;
            raiz.ant = nuevo;
            ultimo.sig = nuevo;
        }
    }

    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (!vacia()) {
            NodoL reco = raiz;
            do {
                System.out.print(reco.Info + "-");
                reco = reco.sig;
            } while (reco != raiz);
            System.out.println();
        }
    }

    public int cantidad() {
        int cant = 0;
        if (!vacia()) {
            NodoL reco = raiz;
            do {
                cant++;
                reco = reco.sig;
            } while (reco != raiz);
        }
        return cant;
    }

    public void borrar(int pos) {
        if (pos <= cantidad()) {
            if (pos == 1) {
                if (cantidad() == 1) {
                    raiz = null;
                } else {
                    NodoL ultimo = raiz.ant;
                    raiz = raiz.sig;
                    ultimo.sig = raiz;
                    raiz.ant = ultimo;
                }
            } else {
                NodoL reco = raiz;
                for (int f = 1; f <= pos - 1; f++) {
                    reco = reco.sig;
                }
                NodoL anterior = reco.ant;
                reco = reco.sig;
                anterior.sig = reco;
                reco.ant = anterior;
            }
        }
    }

    String getDato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    NodoL getSiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSiguiente(NodoL primero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
