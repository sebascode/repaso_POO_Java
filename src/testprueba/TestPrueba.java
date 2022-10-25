package testprueba;

import static java.lang.System.in;
import java.time.Period;
import java.time.LocalDate;
import java.time.Month;
import testprueba.DTO.Giftcard;

import testprueba.servicio.IListar;
import testprueba.servicio.implementacion.Listar;

public class TestPrueba {

    public static void main(String[] args) {
        // TODO code application logic here
        Giftcard gc = new Giftcard();
        gc.setFechaVencimiento(LocalDate.of(2022, Month.JULY, 10));
        gc.setMoneyMoney(300000);
        
        if(gc.estaVencido()){
            System.out.println("Está vencido gilberto.");
        }
        else{
            System.out.println("no está vencido cumpita, pongale weno.");
        }
        
        System.out.println("======================");
        System.out.println("Trata de convertir: ");
        System.out.println(gc.trataConvertir("abc"));
        
        
        
        System.out.println("======================");
        IListar appLista = new Listar();
        appLista.Agregar("Hola");
        appLista.Agregar("Como");
        appLista.Agregar("Le Baila");
        
        System.out.println(appLista.Buscar(1));
        
        for(String palabra : appLista.mostrarTodo()){
            System.out.println(palabra);
        }
    }
}
