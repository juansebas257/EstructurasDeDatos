package ArbolesBTS;

import javax.swing.JOptionPane;

public class Ejecutar {

    public static void main(String[] args) {
        int opcion = 0;
        int elemento;

        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar Nodo\n"
                        + "2. Recorrer Arbol InOrder\n"
                        + "3. Recorrer Arbol preOrder\n"
                        + "4. Recorrer Arbol postOrder\n"
                        + "5. Buscar Nodo en el Arbol \n"
                        + "6. Eliminar nodo del Arbol \n"
                        + "7. Salir\n"
                        + "Elige una Opcion", "Arboles", JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero del nodo..",
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        arbolito.Insertar(elemento);
                        break;
                    case 2:
                        if (!arbolito.Estavacio()) {
                            System.out.println();
                            arbolito.inOrder(arbolito.Raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "el Arbol esta Vacio", "cuidado", JOptionPane.QUESTION_MESSAGE);
                        }
                        break;

                    case 3:
                        if (!arbolito.Estavacio()) {
                            System.out.println();
                            arbolito.preOrder(arbolito.Raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol esta Vacio", "cuidado", JOptionPane.QUESTION_MESSAGE);
                        }
                        break;

                    case 4:
                        if (!arbolito.Estavacio()) {
                            System.out.println();
                            arbolito.postOrder(arbolito.Raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol esta Vacio", "cuidado", JOptionPane.QUESTION_MESSAGE);
                        }

                        break;

                    case 5:
                        if (!arbolito.Estavacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero del nodo a buscar..",
                                    "Buscar Nodo", JOptionPane.QUESTION_MESSAGE));
                            arbolito.Buscar(elemento);
                            if (arbolito.Buscar(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado", "Nodo no encontrado", JOptionPane.QUESTION_MESSAGE);
                            } else {
                                System.out.println("nodo encontrado, " + arbolito.Buscar(elemento));
                            }

                        }

                        break;
                    case 6:
                        if (!arbolito.Estavacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero del nodo a Eliminar..",
                                    "Eliminando Nodo", JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.Eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "Nodo no se encuentra en el arbol", "Nodo no encontrado", JOptionPane.QUESTION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Nodo Eliminado", "Nodo Eliminado", JOptionPane.QUESTION_MESSAGE);
                            }

                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Operacion Finalizada", "Fin", JOptionPane.QUESTION_MESSAGE);

                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "cuidado", JOptionPane.QUESTION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 2);

    }
}
