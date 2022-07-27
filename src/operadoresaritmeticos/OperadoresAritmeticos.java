/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package operadoresaritmeticos;
import java.util.Scanner;

/**
 *
 * @author m_mur
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner entrada=new Scanner (System.in);

   int opcion; 

    System.out.println("Bienvenido!");

    System.out.println("Operaciones Aritmeticas a realizar");

    System.out.println("1.Sumar valores");

    System.out.println("2.Restar valores");

    System.out.println("3.Multiplicar valores");

    System.out.println("4.Dividir valor");

    System.out.println("Ingrese la opcion que desea elaborar: ");

    opcion=entrada.nextInt();

     

    switch (opcion)

    {

      case 1:

        int val1, val2, suma;

        System.out.println("Ingrese el primer valor: ");

        val1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        val2=entrada.nextInt();

        suma=val1+val2;

        System.out.println("El resultado de la suma es: "+suma);

        break; 

      case 2: 

        int val11,val22,resta;

         System.out.println("Ingrese el primer valor: ");

        val1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        val2=entrada.nextInt();

        resta=val1-val2;

         System.out.println("El resultado de la resta es: "+resta);

        break; 

      case 3:

        int val31,val32,multi;

         System.out.println("Ingrese el primer valor: ");

        val1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        val2=entrada.nextInt();

        multi=val1*val2;

         System.out.println("El resultado de la multiplicacion es: "+multi);

        break; 

      case 4:

        double val41,val42,div;

         System.out.println("Ingrese el primer valor: ");

        val1=entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");

        val2=entrada.nextInt();

        div=val1/val2;

         System.out.println("El resultado de la division es: "+div);

        break;

      default: 

        System.out.print("Numero no valido");

        

        

    }

  }  
    }
    

