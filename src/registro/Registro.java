/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro;
import java.util.Scanner;

public class Registro {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int añoAct=2024; 
        int edadMin=18; 

        System.out.println("Ingrese el año de nacimiento (o  escriba -1 para salir):");

        while (true){
            System.out.print("Año de nacimiento: ");
            int añoNacimiento=scanner.nextInt();

            if (añoNacimiento==-1){
                break; 
            }

            int edad=añoAct-añoNacimiento;

            if (edad>=edadMin){
                System.out.println("La persona es apta para votar.");
            }else{
                System.out.println("La persona no es apta para votar.");
            }
        }
                
    }
    
}
