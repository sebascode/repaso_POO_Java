package testprueba.servicio;

import java.util.ArrayList;

public interface IListar {
    
    public ArrayList<String> mostrarTodo();
    
    public String Buscar(int id);
    
    public void Agregar(String elemento);
}
