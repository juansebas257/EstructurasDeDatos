
public class Principal {

    public static void main(String[] args) {

        ListaEnlazada obj = new ListaEnlazada();
        
        obj.InsertarDato(1);
        obj.InsertarDato(2);
        obj.InsertarDato(3);
        obj.InsertarDato(4);
        obj.InsertarDato(5);
        obj.InsertarDato(6);
        obj.InsertarDato(7);
        obj.InsertarDato(8);
        obj.InsertarDato(9);
        obj.InsertarDato(10);
        obj.Listar();
        System.out.println(obj.Listar());
        obj.BorrarPosicion(1);
        System.out.println(obj.Listar());
        obj.BorrarUltimo();
        System.out.println(obj.Listar());
        
        
       
       
        
        

    }

}
