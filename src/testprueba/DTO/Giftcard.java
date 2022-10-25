/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprueba.DTO;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Cetecom
 */
public class Giftcard {
    
    private LocalDate fechaVencimiento;
    private int MoneyMoney;

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getMoneyMoney() {
        return MoneyMoney;
    }

    public void setMoneyMoney(int MoneyMoney) {
        this.MoneyMoney = MoneyMoney;
    }
    
    // Ejemplo de validación de fechas
    public boolean estaVencido(){
        
        LocalDate fechaActual = LocalDate.now();
        
        Period vencimiento = Period.between(fechaVencimiento, fechaActual);
        
        return(vencimiento.getYears() >= 0 && vencimiento.getMonths() >= 0 && vencimiento.getDays() >= 0);
    }
    
    // Ejemplo de exceptions
    public int trataConvertir(String numero){
        try{
            return Integer.parseInt(numero);
        } catch(Exception ex){
            System.out.println("Ocurrió un error de formato.");
        }
        return -1;
    }
}
