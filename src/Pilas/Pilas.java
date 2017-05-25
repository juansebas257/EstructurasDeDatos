/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author Sebastian
 */
public class Pilas {
    
    Nodo primero;
    int tamannio=0;
    
    public Pilas(){
        primero=null;
    }
    
    public void apilar(Nodo nodo){
        if(primero==null){
            primero=nodo;
        }else{
            nodo.setSiguiente(primero);
            primero=nodo;
        }
        tamannio++;
    }
    
    public void desapilar(Nodo nodo){
        Nodo actual=primero;
        do{
            if(actual.getDato()==nodo.getDato()){
                //se encontro el nodo, ahora se desapila...
            }
            actual=actual.getSiguiente();
        }while(actual.getSiguiente()!=null);
    }
}
