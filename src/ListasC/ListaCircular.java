
/**
 *
 * @author JuanCamilo
 */
public class ListaCircular {

    public static void main(String[] args) {

        Nodo lc = new Nodo();
        lc.insertarPrimero(100);
        lc.insertarPrimero(45);
        lc.insertarPrimero(12);
        lc.insertarPrimero(4);
        System.out.println("Luego de insertar 4 nodos al principio");
        lc.imprimir();
        lc.insertarUltimo(250);
        lc.insertarUltimo(7);
        System.out.println("Luego de insertar 2 nodos al final");
        lc.imprimir();
        System.out.println("Cantidad de nodos:" + lc.cantidad());
        System.out.println("Luego de borrar el de la primer posición:");
        lc.borrar(1);
        lc.imprimir();
        System.out.println("Luego de borrar el de la cuarta posición:");
        lc.borrar(4);
        lc.imprimir();

    }

}
