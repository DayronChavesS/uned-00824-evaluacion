/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

public class Minimo {
    public double busca_minimo (double x, double y, double z)
    {
        double valorminimo = x; 
        if (valorminimo > y)
            valorminimo = y; 
        if  (valorminimo > z) 
            valorminimo = z;
       return valorminimo;     
    }
    
    public double porcentaje (double minimo)
    {
    double valorporcentaje = minimo* 0.25;
    return valorporcentaje;
    }
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        Minimo elminimo = new Minimo();
        char opcion;
        
        do
        {
            System.out.print("Introduzca el primer numero:");
            double numero1 = entrada.nextDouble();
            System.out.print("Introduzca el segundo numero:");
            double numero2 = entrada.nextDouble();
            System.out.print("Introduzca el tercer numero:");
            double numero3 = entrada.nextDouble();
            
            double resultado = elminimo.busca_minimo(numero1, numero2, numero3);
            System.out.print("El numero menor es: "+resultado+"\n");
            double porcentaje = elminimo.porcentaje(resultado);
            System.out.print("El 25% de "+ resultado+ "es: " + porcentaje + "\n");
            System.out.print("Desea realizar la accion nuevamente? (s/n) \n");
            opcion = entrada.next().charAt(0);
        }
        while (opcion=='S'||opcion=='s');
    }
    
            
}
