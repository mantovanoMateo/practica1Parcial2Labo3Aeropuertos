package Models;

import java.util.ArrayList;

public class AlmacenadorGenerico <T>{
    ArrayList<T> objetosAlmacenados;

    public AlmacenadorGenerico(ArrayList<T> objetosAlmacenados) {
        this.objetosAlmacenados = objetosAlmacenados;
    }

    public AlmacenadorGenerico() {
        objetosAlmacenados=new ArrayList<>();
    }

    public ArrayList<T> getObjetosAlmacenados() {
        return objetosAlmacenados;
    }

    public void setObjetosAlmacenados(ArrayList<T> objetosAlmacenados) {
        this.objetosAlmacenados = objetosAlmacenados;
    }

    public void agregar(T nuevo){
        objetosAlmacenados.add(nuevo);
    }
    public void eliminar(T aEliminar){
        objetosAlmacenados.remove(aEliminar);
    }

    public T recuperarSegunPosicion(int index){
        T buscado=objetosAlmacenados.get(index);
        return buscado;
    }
}
