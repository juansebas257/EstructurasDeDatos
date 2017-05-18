package ArbolesBTS;

public class ArbolBinario {

    PanelArboles Raiz;

    public ArbolBinario() {
        Raiz = null;
    }
    // metodo para insertar un nodo en el arbol

    public void Insertar(int d) {
        PanelArboles nuevo = new PanelArboles(d);
        if (Raiz == null) {
            Raiz = nuevo;
        } else {
            PanelArboles Auxiliar = Raiz;
            PanelArboles Padre;

            while (true) {
                Padre = Auxiliar;
                if (d < Auxiliar.dato) {
                    Auxiliar = Auxiliar.Izquierdo;
                    if (Auxiliar == null) {
                        Padre.Izquierdo = nuevo;
                        return;
                    }
                } else {
                    Auxiliar = Auxiliar.Derecho;
                    if (Auxiliar == null) {
                        Padre.Derecho = nuevo;
                        return;
                    }

                }
            }
        }

    }

    public boolean Estavacio() {
        return Raiz == null;
    }

    public void inOrder(PanelArboles r) {
        if (r != null) {
            inOrder(r.Izquierdo);
            System.out.print(r.dato+ ", ");
            inOrder(r.Derecho);
        }
    }

    public void preOrder(PanelArboles r) {
        if (r != null) {
            System.out.print(r.dato+ ", ");
            preOrder(r.Izquierdo);
            preOrder(r.Derecho);
        }
    }

    public void postOrder(PanelArboles r) {
        if (r != null) {
            postOrder(r.Izquierdo);
            postOrder(r.Derecho);
            System.out.print(r.dato + ", ");
        }
    }

    public PanelArboles Buscar(int d) {
        PanelArboles aux = Raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.Izquierdo;
            } else {
                aux = aux.Derecho;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean Eliminar(int d) {
        PanelArboles Auxiliar = Raiz;
        PanelArboles Padre = Raiz;

        boolean esIzquierdo = true;

        while (Auxiliar.dato != d) {
            Padre = Auxiliar;
            if (d < Auxiliar.dato) {
                esIzquierdo = true;
                Auxiliar = Auxiliar.Izquierdo;
            } else {
                esIzquierdo = false;
                Auxiliar = Auxiliar.Derecho;
            }
            if (Auxiliar == null) {
                return false;
            }
        }//fin del whilw
        if (Auxiliar.Izquierdo == null && Auxiliar.Derecho == null) {
            if (Auxiliar == Raiz) {
                Raiz = null;
            } else if (esIzquierdo) {
                Padre.Izquierdo = null;
            } else {
                Padre.Derecho = null;
            }

        } else if (Auxiliar.Derecho == null) {
            if (Auxiliar == Raiz) {
                Raiz = Auxiliar.Izquierdo;
            } else if (esIzquierdo) {
                Padre.Izquierdo = Auxiliar.Izquierdo;
            } else {
                Padre.Derecho = Auxiliar.Izquierdo;
            }
        } else if (Auxiliar.Izquierdo == null) {
            if (Auxiliar == Raiz) {
                Raiz = Auxiliar.Derecho;
            } else if (esIzquierdo) {
                Padre.Izquierdo = Auxiliar.Derecho;
            } else {
                Padre.Derecho = Auxiliar.Izquierdo;
            }
        } else {
            PanelArboles reemplazo = Obtener(Auxiliar);
            if (Auxiliar == Raiz) {
                Raiz = reemplazo;
            } else if (esIzquierdo) {
                Padre.Izquierdo = reemplazo;
            } else {
                Padre.Derecho = reemplazo;
            }
            reemplazo.Izquierdo = Auxiliar.Izquierdo;
        }
        return true;
    }

    public PanelArboles Obtener(PanelArboles NodoRem) {
        PanelArboles reemplazarPadre = NodoRem;
        PanelArboles reemplazo = NodoRem;
        PanelArboles auxiliar = NodoRem.Derecho;

        while (auxiliar != null) {
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.Izquierdo;
        }
        if (reemplazo != NodoRem.Derecho) {
            reemplazarPadre.Izquierdo = reemplazo.Derecho;
            reemplazo.Derecho = NodoRem.Derecho; 
        }
        System.out.println("el nodo remplazado es " + reemplazo);
        return reemplazo;
    }
}
