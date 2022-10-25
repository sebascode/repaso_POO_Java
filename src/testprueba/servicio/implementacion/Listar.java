package testprueba.servicio.implementacion;

import java.util.ArrayList;
import testprueba.servicio.IListar;

public class Listar implements IListar {

    private ArrayList<String> lista;
    
    public Listar(){
        this.lista = new ArrayList();
    }
    
    @Override
    public ArrayList<String> mostrarTodo() {
        return lista;
    }

    @Override
    public String Buscar(int id) {
        return lista.get(id);
    }

    @Override
    public void Agregar(String elemento) {
        lista.add(elemento);
    }
    
}
